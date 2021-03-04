import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */

class SimpleBankAccountTest extends BankAccountTestAbstract {

    private final int idToTest = 1;
    private final int idToTestWrong = 2;
    private final double amountToTest = 100;
    private final double otherAmountToTest = 60;
    private final double valueExpectedToTest = 100;
    private final double otherValueExpectedToTest = 40;

    @BeforeEach
    void beforeEach() {
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccount(accountHolder, 0);
    }

    @Test
    void testMySimpleDeposit() {
        testDeposit (idToTest, amountToTest, valueExpectedToTest);
    }

    @Test
    void testMySimpleWrongDeposit() {
        testWrongDeposit (idToTest,idToTestWrong, amountToTest, otherAmountToTest, valueExpectedToTest);
    }

    @Test
    void testMySimpleWithdraw() {
        testWithdraw (idToTest, amountToTest, otherAmountToTest, otherValueExpectedToTest);
    }

    @Test
    void testMySimpleWrongWithdraw() {
        testWrongWithdraw (idToTest,idToTestWrong, amountToTest, otherAmountToTest, valueExpectedToTest);
    }

}
