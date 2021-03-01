package lab01.example.model;

public abstract class BankAccountAbstract {

    double balance;
    AccountHolder holder;

    public AccountHolder getHolder(){
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }

}
