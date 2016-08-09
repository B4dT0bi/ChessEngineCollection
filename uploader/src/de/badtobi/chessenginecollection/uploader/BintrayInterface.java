package de.badtobi.chessenginecollection.uploader;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import de.badtobi.chessenginecollection.uploader.entities.Index;

import java.io.File;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class BintrayInterface {
    private static final String BASE_URL = "https://api.bintray.com/";
    private static final String DEFUALT_VERSION = "Testing";
    private String userName;
    private String apiKey;
    private String repo;
    private String version;
    private String signKey = null;

    public BintrayInterface(String userName, String apiKey, String repo) {
        this(userName, apiKey, repo, DEFUALT_VERSION);
    }

    public BintrayInterface(String userName, String apiKey, String repo, String version) {
        this(userName, apiKey, repo, version, null);
    }

    public BintrayInterface(String userName, String apiKey, String repo, String version, String signKey) {
        this.userName = userName;
        this.apiKey = apiKey;
        this.repo = repo;
        this.version = version;
        this.signKey = signKey;
        setup();
    }

    public boolean uploadFile(File fileToUpload, String filename, String folder) {
        try {
            HttpResponse<String> response = null;
            if (signKey != null) {
                response = Unirest.put(getUploadUrl() + folder + filename)
                        .header("X-GPG-PASSPHRASE", signKey)
                        .basicAuth(userName, apiKey)
                        .field("file", fileToUpload)
                        .asString();
            }
            else {
                response = Unirest.put(getUploadUrl() + folder + filename)
                        .basicAuth(userName, apiKey)
                        .field("file", fileToUpload)
                        .asString();
            }
            System.out.println(response.getStatusText());
            return "Created".equals(response.getStatusText());
        }
        catch (UnirestException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Index getIndex() {
        try {
            HttpResponse<Index> json = Unirest.get(getDownloadUrl("engines.json")).asObject(Index.class);
            return json.getBody();
        }
        catch (UnirestException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void setup() {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, apiKey.toCharArray());
            }
        });
    }

    private String getRequestUrl() {
        return BASE_URL + userName + "/" + repo + "/" + version + "/";
    }

    private String getUploadUrl() {
        return BASE_URL + "content/" + userName + "/generic/" + repo + "/" + version + "/";
    }

    private String getDownloadUrl(String file) {
        return getRequestUrl() + file;
    }
}
