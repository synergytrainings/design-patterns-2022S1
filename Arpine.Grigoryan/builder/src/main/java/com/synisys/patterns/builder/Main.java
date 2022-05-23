package com.synisys.patterns.builder;

public class Main {

    public static void main(String[] args) {

        SelfEvaluation s = SelfEvaluation.create().employeeName("TestEmploy").question("Question1").objective("Objective1").build();
        System.out.println(s.toString());

        EmployeeImpl.Initializer<?, ?> initializer = EmployeeImpl.Initializer.create();
        EmployeeImpl employeeImpl = new EmployeeImpl(initializer.setDepartment("Department").setName("Name").setEmail("ahshsa@jaj.com"));
        EmployeeImpl employeeImpl2 = new EmployeeImpl(initializer.setName("Name").setDepartment("Department"));
        System.out.println(employeeImpl.toString());
        System.out.println(employeeImpl2.toString());

    }
}
