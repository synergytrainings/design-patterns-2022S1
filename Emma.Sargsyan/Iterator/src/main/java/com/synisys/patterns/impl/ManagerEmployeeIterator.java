package com.synisys.patterns.impl;

import com.synisys.patterns.GraphIterator;

/**
 * Created by emma.sargsyan
 */
public class ManagerEmployeeIterator implements GraphIterator<Employee> {

    private int managersIndex = -1;
    private int employeesIndex = -1;
    private final Employee employee;

    public ManagerEmployeeIterator(Employee employee){
        this.employee = employee;
    }

    @Override
    public boolean hasNextSources() { return this.managersIndex + 1 < this.employee.getSources().size(); }

    @Override
    public Employee nextSources() {
        if(this.managersIndex < this.employee.getSources().size())
            return this.employee.getSources().get(++this.managersIndex);
        return null;
    }

    @Override
    public boolean hasNextDestinations() {
        return this.employeesIndex + 1  < this.employee.getDestinations().size();
    }

    @Override
    public Employee nextDestinations() {
        if(this.employeesIndex < this.employee.getDestinations().size())
            return this.employee.getDestinations().get(++this.employeesIndex);
        return null;
    }

    @Override
    public boolean hasPreviousSources() {
        return this.managersIndex > 0;
    }

    @Override
    public Employee previousSources() {
        if( this.managersIndex > 0)
            return this.employee.getSources().get(--this.managersIndex);
        return null;
    }

    @Override
    public boolean hasPreviousDestinations() {
        return this.employeesIndex > 0;
    }

    @Override
    public Employee previousDestinations() {
        if( this.employeesIndex > 0)
            return this.employee.getDestinations().get(--this.employeesIndex);
        return null;
    }
}