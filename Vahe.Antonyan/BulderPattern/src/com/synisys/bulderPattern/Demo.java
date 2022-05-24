package com.synisys.bulderPattern;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User.Builder("John", "Smith")
//                .age(70)
                .birthdate(LocalDate.of(1952, 1, 1))
                .passportNo("AP123456")
                .build();

        User user2 = new User.Builder("John", "Smith")
                .age(70)
//                .birthdate(LocalDate.of(1952, 1, 1))
                .passportNo("AP123456")
                .build();

        User user3 = new User.Builder("John", "Smith")
                .birthdate(LocalDate.of(1952, 1, 1))
                .build();

/*
//        Compile time error. Age and birthdate methods can't be used together.
        User user4 = new User.Builder("John", "Smith")
                .age(70)
                .birthdate(LocalDate.of(1952, 1, 1))
                .passportNo("AP123456")
                .build();
*/

        System.out.println("User1 " + user1);
        System.out.println("User2 " + user2);
        System.out.println("User3 " + user3);
    }
}