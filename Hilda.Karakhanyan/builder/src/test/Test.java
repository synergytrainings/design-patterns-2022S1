package test;


import main.java.Email;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // as user should can't mention both sendNow and sendingDate, at first it chooses one of the methods, then
        // other methods become available
        Email.Builder emailBuilder = new Email.Builder("me", "someone");
        Email emailSendNow = emailBuilder
                .sendNow(true)
                .subject("Subject")
                .content("Some text")
                .build();
        System.out.println(emailSendNow);
        Email.Builder emailBuilder2 = new Email.Builder("me", "someone");
        Email emailSendByDate = emailBuilder2
                .sendingDate(LocalDate.now().plusDays(1))
                .subject("Subject")
                .content("Some text")
                .cc("person1")
                .cc("person2")
                .cc("person3")
                .ccAll("p4", "p5")
                .build();
        System.out.println(emailSendByDate);
    }
}
