package com.synisys;

public class User {
    private String nickName;
    private String mail;
    private Account bankAccount;

    public User(String nickName, String mail, Account bankAccount) {
        this.nickName = nickName;
        this.mail = mail;
        this.bankAccount = bankAccount;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Account getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Account bankAccount) {
        this.bankAccount = bankAccount;
    }
}
