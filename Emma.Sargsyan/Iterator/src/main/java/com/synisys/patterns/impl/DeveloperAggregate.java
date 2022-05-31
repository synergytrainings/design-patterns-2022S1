package com.synisys.patterns.impl;

import com.synisys.patterns.GraphAggregate;

/**
 * Created by emma.sargsyan
 */
public class DeveloperAggregate implements GraphAggregate<Employee> {
    private Employee employee;

    public DeveloperAggregate(Employee employee) {
        this.employee = employee;
    }

    @Override
    public DeveloperIterator getIterator() {
        return new DeveloperIterator(employee);
    }

}