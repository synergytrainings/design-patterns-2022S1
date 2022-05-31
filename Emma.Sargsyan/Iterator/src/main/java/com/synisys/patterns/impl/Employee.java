package com.synisys.patterns.impl;

import com.synisys.patterns.GraphVertex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emma.sargsyan
 */
public class Employee implements GraphVertex {

    public Employee(String firstName, String lastName, Position position, List<Employee> managers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.managers = managers;
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getSources() {
        return managers;
    }

    @Override
    public List<Employee> getDestinations() {
        return employees;
    }

    private String firstName;
    private String lastName;
    private Position position;
    private List<Employee> employees;
    private List<Employee> managers;

    public void addEmployees(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void addManager(Employee manager) {
        this.managers.add(manager);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Employee is %s %s.", firstName, lastName);
    }
}