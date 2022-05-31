package com.synisys.patterns.impl;

import com.synisys.patterns.GraphIterator;

/**
 * Created by emma.sargsyan
 */
public class DeveloperIterator implements GraphIterator<Employee> {

    private int managersIndex = 0;
    private int employeesIndex = 0;
    private final Employee employee;

    public DeveloperIterator(Employee employee){
        this.employee = employee;
    }

    @Override
    public boolean hasNextSources() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Employee nextSources() {
        while(this.managersIndex < this.employee.getSources().size()) {
            if(this.employee.getSources().get(this.managersIndex).getPosition() == Position.DEVELOPER)
                return this.employee.getSources().get(this.managersIndex++);
            this.managersIndex++;
        }
        return null;
    }

    @Override
    public boolean hasNextDestinations() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Employee nextDestinations() {
        while(this.employeesIndex < this.employee.getDestinations().size()) {
            if(this.employee.getDestinations().get(this.employeesIndex).getPosition() == Position.DEVELOPER)
                return this.employee.getDestinations().get(this.employeesIndex++);
            this.employeesIndex++;
        }
        return null;
    }

    @Override
    public boolean hasPreviousSources() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Employee previousSources() {
        while(this.managersIndex > 0) {
            if(this.employee.getSources().get(this.managersIndex).getPosition() == Position.DEVELOPER)
                return this.employee.getSources().get(this.managersIndex--);
            this.managersIndex--;
        }
        return null;
    }

    @Override
    public boolean hasPreviousDestinations() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Employee previousDestinations() {
        while(this.employeesIndex > 0) {
            if(this.employee.getDestinations().get(this.employeesIndex).getPosition() == Position.DEVELOPER)
                return this.employee.getDestinations().get(this.employeesIndex--);
            this.employeesIndex--;
        }
        return null;
    }

}