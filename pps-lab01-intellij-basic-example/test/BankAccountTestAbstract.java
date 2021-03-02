import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test suite abstract for testing implementation
 */

public abstract class BankAccountTestAbstract {

    AccountHolder accountHolder;
    BankAccount bankAccount;

    public void testDeposit(final int ID, final double amount, final double valueExpected) {
        bankAccount.deposit(ID, amount);
        assertEquals(valueExpected, bankAccount.getBalance());
    }

    public void testWrongDeposit(final int ID,final int wrongID, final double amount, final double otherAmount, final double valueExpected) {
        bankAccount.deposit(ID, amount);
        bankAccount.deposit(wrongID, otherAmount);
        assertEquals(valueExpected, bankAccount.getBalance());
    }

    public void testWithdraw(final int ID,final double amount,final double otherAmount,final double otherValueExpected) {
        bankAccount.deposit(ID, amount);
        bankAccount.withdraw(ID, otherAmount);
        assertEquals(otherValueExpected, bankAccount.getBalance());
    }

    public void testWrongWithdraw(final int ID,final int wrongID, final double amount, final double otherAmount, final double valueExpected) {
        bankAccount.deposit(ID, amount);
        bankAccount.withdraw(wrongID, otherAmount);
        assertEquals(valueExpected, bankAccount.getBalance());
    }

}
