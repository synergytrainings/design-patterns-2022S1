package main.java;

import java.util.ArrayList;
import java.util.List;

public class EmailNotification {
    private List<String> cc;
    private String subject;
    private String from;
    private String to;
    private String content;

    private EmailNotification(String from, String to, List<String> cc, String subject, String content) {
        this.cc = cc;
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Email{" +
                "cc=" + cc +
                ", subject='" + subject + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static class Factory {

        public static EmailNotification with(String from, String to, String content, String subject) {
            return new EmailNotification(from, to, new ArrayList<>(), subject, content);
        }

        public static EmailNotification withCC(String from, String to, String content, String subject, List<String> cc) {
            return new EmailNotification(from, to, cc, subject, content);
        }

        public static EmailNotification withFromAndToOnly(String from, String to) {
            return new EmailNotification(from, to, null, null, null);
        }

        public static EmailNotification withFromAndToAndContentOnly(String from, String to, String content) {
            return new EmailNotification(from, to, new ArrayList<>(), null, content);
        }

        public static EmailNotification withFromAndToAndSubjectOnly(String from, String to, String subject) {
            return new EmailNotification(from, to, new ArrayList<>(), subject, null);
        }
    }

    public static void main(String[] args) {
        System.out.println("email: " + Factory.with("me", "somebody", "content", "subject"));
        System.out.println("email with cc: " + Factory.withCC("me", "somebody", "content", "subject", List.of("someone")));
        System.out.println("email with from and to: " + Factory.withFromAndToOnly("me", "somebody"));
        System.out.println("email with from and to and content: " + Factory.withFromAndToAndContentOnly("me", "somebody", "content"));
        System.out.println("email with from and to and subject: " + Factory.withFromAndToAndSubjectOnly("me", "somebody", "subject"));

    }

}
