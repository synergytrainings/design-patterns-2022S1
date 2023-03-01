package com.synisys.models;

import com.synisys.enums.Permission;

import java.util.Set;

public class Account {

    private String username;
    private String associatedMailAddress;
    private Set<Permission> accountPermissions;
    private Set<Repository> repositories;

    public Account(String username, String associatedMailAddress, Set<Permission> accountPermissions) {
        this.username = username;
        this.associatedMailAddress = associatedMailAddress;
        this.accountPermissions = accountPermissions;
    }

    public Account(String user, String s) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAssociatedMailAddress() {
        return associatedMailAddress;
    }

    public void setAssociatedMailAddress(String associatedMailAddress) {
        this.associatedMailAddress = associatedMailAddress;
    }

    public Set<Permission> getAccountPermissions() {
        return accountPermissions;
    }

    public void setAccountPermissions(Set<Permission> accountPermissions) {
        this.accountPermissions = accountPermissions;
    }

    public Set<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(Set<Repository> repositories) {
        this.repositories = repositories;
    }
}
