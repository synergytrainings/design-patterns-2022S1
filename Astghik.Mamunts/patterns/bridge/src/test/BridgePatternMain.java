package test;

import main.api.Account;
import main.api.Bank;
import main.impl.ConverseBank;
import main.impl.CurrentAccount;
import main.impl.HSBCBank;
import main.impl.SavingAccount;

public class BridgePatternMain {

    public static void main(String[] args) {
        Bank converseBank = new ConverseBank(new CurrentAccount());
        Account current = converseBank.openAccount();
        current.accountType();

        Bank hsbcBank = new HSBCBank(new SavingAccount());
        Account saving = hsbcBank.openAccount();
        saving.accountType();
    }

}
