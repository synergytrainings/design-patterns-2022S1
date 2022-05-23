package com.synisys.patterns.builder;

public class EmployeeImpl {
    private String employeeName;
    private String department;
    private String email;

    public EmployeeImpl(Initializer<TRUE, TRUE> initializer) {
        this(initializer.employeeName, initializer.department, initializer.email);

    }

    private EmployeeImpl(String employeeName, String department, String email) {
        this.employeeName = employeeName;
        this.department = department;
        this.email = email;
    }

    public static class Initializer<HasName, HasDepartment> {
        private String employeeName;
        private String department;
        private String email;

        public Initializer() {
        }

        public Initializer(String name, String department, String email) {
            this.employeeName = name;
            this.department = department;
            this.email = email;
        }

        public static Initializer<FALSE,FALSE> create() {
            return new Initializer<FALSE, FALSE>();
        }

        public Initializer<TRUE, HasDepartment> setName(String name) {
            this.employeeName = name;
            return new Initializer<TRUE, HasDepartment>(name, this.department, this.email);
        }

        public Initializer<HasName, TRUE> setDepartment(String department) {
            this.department = department;
            return new Initializer<HasName, TRUE>(this.employeeName, department, this.email);
        }

        public Initializer<HasName, HasDepartment> setEmail(String email) {
            this.email = email;
            return new Initializer<HasName, HasDepartment>(this.employeeName, this.department,email);
        }
    }

    static abstract class TRUE {
    }
    static abstract class FALSE {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
