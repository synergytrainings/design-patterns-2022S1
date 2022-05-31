package com.synisys.patterns.impl;


import com.synisys.patterns.Graph;

/**
 * Created by emma.sargsyan
 */
public class OrgChart implements Graph<Employee> {

    public OrgChart(Employee owner, String companyName, Integer foundationYear) {
        this.owner = owner;
        this.companyName = companyName;
        this.foundationYear = foundationYear;
    }

    @Override
    public Employee getFirstVertex() {
        return owner;
    }

    private Employee owner;
    private String companyName;
    private Integer foundationYear;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(Integer foundationYear) {
        this.foundationYear = foundationYear;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }
}