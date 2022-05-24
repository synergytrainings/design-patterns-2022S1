package com.synisys.bulderPattern;

import java.time.LocalDate;

public class User {
    private final String name;
    private final String surname;
    private final Integer age;
    private final LocalDate birthdate;
    private final String passportNo;

    public interface IAge {
        IPassportNo age(Integer integer);
    }

    public interface IBirthdate {
        IPassportNo birthdate(LocalDate localDate);
    }

    public interface IPassportNo extends IBuilder {
        IBuilder passportNo(String string);
    }

    public interface IBuilder {
        User build();
    }

    public static class Builder implements IAge, IBirthdate, IPassportNo, IBuilder {
        // Required parameters
        private final String name;
        private final String surname;

        // Optional parameters
        private Integer age = null;
        private LocalDate birthdate = null;
        private String passportNo = null;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public IPassportNo age(Integer val) {
            age = val;
            return this;
        }

        @Override
        public IPassportNo birthdate(LocalDate val) {
            birthdate = val;
            return this;
        }

        @Override
        public IBuilder passportNo(String val) {
            passportNo = val;
            return this;
        }

        @Override
        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        name = builder.name;
        surname = builder.surname;
        age = builder.age;
        birthdate = builder.birthdate;
        passportNo = builder.passportNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthdate=" + birthdate +
                ", passportNo='" + passportNo + '\'' +
                '}';
    }
}
