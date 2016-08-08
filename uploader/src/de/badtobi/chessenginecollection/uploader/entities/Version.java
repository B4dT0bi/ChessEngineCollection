package de.badtobi.chessenginecollection.uploader.entities;

/**
 * Created by b4dt0bi on 08.08.16.
 */
public class Version {
    private String versionId;
    private String variant;
    private String link;
    private String linkAsc;
    private String additionalFileSet;
    private String hash;

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkAsc() {
        return linkAsc;
    }

    public void setLinkAsc(String linkAsc) {
        this.linkAsc = linkAsc;
    }

    public String getAdditionalFileSet() {
        return additionalFileSet;
    }

    public void setAdditionalFileSet(String additionalFileSet) {
        this.additionalFileSet = additionalFileSet;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
