package com.synisys.patterns.impl;

import com.synisys.patterns.GraphAggregate;

/**
 * Created by emma.sargsyan
 */
public class ManagerEmployeeAggregate implements GraphAggregate<Employee> {
    private Employee employee;

    public ManagerEmployeeAggregate(Employee employee) {
        this.employee = employee;
    }

    @Override
    public ManagerEmployeeIterator getIterator() {
        return new ManagerEmployeeIterator(employee);
    }

}