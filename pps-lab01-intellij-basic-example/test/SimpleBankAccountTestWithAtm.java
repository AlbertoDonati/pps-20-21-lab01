import lab01.example.model.AccountHolder;
import lab01.example.model.SimpleBankAccountWithAtm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test suite for testing the SimpleBankAccountWithAtm implementation
 */
class SimpleBankAccountTestWithAtm extends BankAccountTestAbstract {

    private final int idToTest = 1;
    private final int idToTestWrong = 2;
    private final double amountToTest = 100;
    private final double otherAmountToTest = 60;
    private final double valueExpectedToTest = 99;
    private final double otherValueExpectedToTest = 38;

    @BeforeEach
    void beforeEach() {
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0, 1);
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
        testWithdraw (idToTest,amountToTest ,otherAmountToTest, otherValueExpectedToTest);
    }

    @Test
    void testMySimpleWrongWithdraw() {
        testWrongWithdraw (idToTest,idToTestWrong, amountToTest, otherAmountToTest, valueExpectedToTest);
    }

}
