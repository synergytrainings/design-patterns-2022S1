package com.synisys.models;

public class Line {

    private Commit lastCommit;
    private File file;
    private Integer lineNumber;
    private String lastCommittedVersion;
    private String currentVersion;

    public Commit getLastCommit() {
        return lastCommit;
    }

    public void setLastCommit(Commit lastCommit) {
        this.lastCommit = lastCommit;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLastCommittedVersion() {
        return lastCommittedVersion;
    }

    public void setLastCommittedVersion(String lastCommittedVersion) {
        this.lastCommittedVersion = lastCommittedVersion;
    }

    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }
}
