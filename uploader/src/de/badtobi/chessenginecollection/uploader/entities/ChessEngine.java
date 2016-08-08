package de.badtobi.chessenginecollection.uploader.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class ChessEngine {
    private String name;
    private String url;
    private String license;
    private String licenseUrl;
    private List<Version> versions = new ArrayList<Version>();
    private List<String> additionalFiles = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    public List<String> getAdditionalFiles() {
        return additionalFiles;
    }

    public void setAdditionalFiles(List<String> additionalFiles) {
        this.additionalFiles = additionalFiles;
    }
}
