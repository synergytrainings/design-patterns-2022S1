package com.synisys.patterns.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 Builder pattern hierarchical example.
 Call EmployeeBuilder for employee creation when questions and objectives fields
 */
public class SelfEvaluation {
    private final String employeeId;
    private final String employeeName;
    private final List<String> questions;
    private final List<String> objectives;

    private SelfEvaluation(Builder builder) {
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.questions = builder.questions;
        this.objectives = builder.objectives;
    }


    protected static class EmployeeBuilder implements Employee {
        private String employeeId;
        private String employeeName;

        public EmployeeBuilder() {
            employeeId = UUID.randomUUID().toString();
        }

        @Override
        public Builder employeeName(String name) {
            this.employeeName = name;
            return Builder.create(employeeId, employeeName);
        }
    }


    protected static class Builder {
        private String employeeId;
        private String employeeName;
        private List<String> questions;
        private List<String> objectives;

        private Builder(String employeeId, String employeeName) {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.questions = new ArrayList<>();
            this.objectives = new ArrayList<>();
        }

        public static Builder create(String employeeId, String employeeName) {
            return new Builder(employeeId, employeeName);
        }

        public Builder question(String question) {
            this.questions.add(question);
            return this;
        }

        public Builder objective(String objective) {
            this.objectives.add(objective);
            return this;
        }


        public SelfEvaluation build() {
            return new SelfEvaluation((Builder) this);
        }
    }

    //mandatory implementation
    interface Employee {
        Builder employeeName(String name);

    }

    public static EmployeeBuilder create() {
        return new EmployeeBuilder();
    }

    @Override
    public String toString() {
        return "SelfEvaluation{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", questions=" + questions +
                ", objectives=" + objectives +
                '}';
    }
}
