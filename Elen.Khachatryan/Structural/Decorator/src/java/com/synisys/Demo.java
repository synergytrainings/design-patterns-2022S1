package com.synisys;

import com.synisys.decorators.AddingMultipleDevicesDecorator;
import com.synisys.decorators.SendEmailDecorator;
import com.synisys.subscriptions.MonthlySubscription;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Lia", "Johnson", LocalDate.of(2000, 10, 10));
        Account account = new Account("1235478996332332566", LocalDate.now().plusYears(2), 4520., person);
        User user = new User("LiaJO", "lia.jo@gmail.com", account);

        Subscription subscription = new MonthlySubscription(user);
        subscription = new SendEmailDecorator(subscription);
        subscription = new AddingMultipleDevicesDecorator(subscription, 10);

        System.out.println("Description: " + subscription.subscriptionDescription());
        System.out.println("Total price: " + subscription.price());
    }
}

