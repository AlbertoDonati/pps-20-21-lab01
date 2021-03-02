package lab01.example;

import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;
import lab01.example.model.SimpleBankAccountWithAtm;

public class Main {

    public static void main(String[] args) {

        final AccountHolder accountHolder = new AccountHolder("Mario", "Rossi", 1);
        final BankAccount bankAccount = new SimpleBankAccount(accountHolder, 0);
        final BankAccount bankAccount1 = new SimpleBankAccountWithAtm(accountHolder,0,1);
        final double amountDeposit1 = 100;
        final double amountWithDraw1 = 30;
        final double amountWithDraw2 = 80;

        // bankAccount which is a BankAccount without Atm

        bankAccount.deposit(accountHolder.getId(), amountDeposit1);
        System.out.println("Current balance is " + bankAccount.getBalance());

        bankAccount.withdraw(accountHolder.getId(), amountWithDraw1);
        System.out.println("Current balance is " + bankAccount.getBalance());

        bankAccount.withdraw(accountHolder.getId(), amountWithDraw2);
        System.out.println("Current balance is " + bankAccount.getBalance());


        // bankAccount1 which is a BankAccount with Atm

        bankAccount1.deposit(accountHolder.getId(), amountDeposit1);
        System.out.println("Current balance with fee is " + bankAccount1.getBalance());

        bankAccount1.withdraw(accountHolder.getId(), amountWithDraw1);
        System.out.println("Current balance with fee is " + bankAccount1.getBalance());

        bankAccount1.withdraw(accountHolder.getId(), amountWithDraw2);
        System.out.println("Current balance with fee is " + bankAccount1.getBalance());

    }
}
