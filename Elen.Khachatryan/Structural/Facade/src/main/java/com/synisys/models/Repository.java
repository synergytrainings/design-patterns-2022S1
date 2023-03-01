package com.synisys.models;

import java.util.List;
import java.util.Set;

public class Repository {
    private List<Commit> commitHistory;

    private List<Change> localChanges;

    private Set<String> branches;

    public List<Commit> getCommitHistory() {
        return commitHistory;
    }

    public void setCommitHistory(List<Commit> commitHistory) {
        this.commitHistory = commitHistory;
    }

    public List<Change> getLocalChanges() {
        return localChanges;
    }

    public void setLocalChanges(List<Change> localChanges) {
        this.localChanges = localChanges;
    }

    public Set<String> getBranches() {
        return branches;
    }

    public void setBranches(Set<String> branches) {
        this.branches = branches;
    }
}
