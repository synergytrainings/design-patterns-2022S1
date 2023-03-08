package com.synisys;

import java.time.LocalDate;

public class Account {
    private String accountNumber;
    private LocalDate accountExpirationDate;
    private Double balance;
    private Person person;

    public Account(String accountNumber, LocalDate accountExpirationDate, Double balance, Person person) {
        this.accountNumber = accountNumber;
        this.accountExpirationDate = accountExpirationDate;
        this.balance = balance;
        this.person = person;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getAccountExpirationDate() {
        return accountExpirationDate;
    }

    public void setAccountExpirationDate(LocalDate accountExpirationDate) {
        this.accountExpirationDate = accountExpirationDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
