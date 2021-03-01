package lab01.example.model;

/**
 * This class represent a particular instance of a BankAccountWithAtm.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdraw is allowed only if the balance greater or equal the withdrawal amount
 */
public class SimpleBankAccountWithAtm extends BankAccountAbstract implements BankAccount {

    private final int fee;

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance, int fee) {
        this.holder = holder;
        this.balance = balance;
        this.fee = fee;
    }

    @Override
    public void deposit(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            this.balance = this.balance + amount - this.fee;
        }
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        if (checkUser(usrID) && isWithdrawAllowed(amount)) {
            this.balance = this.balance - amount - this.fee;
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount + this.fee;
    }

}
