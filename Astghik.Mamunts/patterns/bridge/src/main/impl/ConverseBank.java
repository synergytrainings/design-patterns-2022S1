package main.impl;

import main.api.Account;
import main.api.Bank;

public class ConverseBank extends Bank {

    public ConverseBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("Open your account with Converse Bank");
        return account;
    }

}
