package com.synisys.models;

import java.time.LocalDateTime;
import java.util.List;

public class Commit {

    private Account committedBy;
    private LocalDateTime commitDate;
    private String message;
    private String commitHash;
    private String branch;
    private Repository repository;
    private List<Change> changes;

    public Commit(Account committedBy, LocalDateTime commitDate, String message, String commitHash, String branch, Repository repository, List<Change> changes) {
        this.committedBy = committedBy;
        this.commitDate = commitDate;
        this.message = message;
        this.commitHash = commitHash;
        this.branch = branch;
        this.repository = repository;
        this.changes = changes;
    }

    public Account getCommittedBy() {
        return committedBy;
    }

    public void setCommittedBy(Account committedBy) {
        this.committedBy = committedBy;
    }

    public LocalDateTime getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(LocalDateTime commitDate) {
        this.commitDate = commitDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public List<Change> getChanges() {
        return changes;
    }

    public void setChanges(List<Change> changes) {
        this.changes = changes;
    }
}
