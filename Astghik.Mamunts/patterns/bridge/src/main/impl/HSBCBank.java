package main.impl;

import main.api.Account;
import main.api.Bank;

public class HSBCBank extends Bank {

    public HSBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("Open your account with HSBC Bank");
        return account;
    }

}
