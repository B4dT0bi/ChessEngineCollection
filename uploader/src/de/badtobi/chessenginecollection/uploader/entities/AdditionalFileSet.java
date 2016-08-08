package de.badtobi.chessenginecollection.uploader.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class AdditionalFileSet {
    private String id;
    private List<String> fileUrls = new ArrayList<String>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getFileUrls() {
        return fileUrls;
    }

    public void setFileUrls(List<String> fileUrls) {
        this.fileUrls = fileUrls;
    }
}
