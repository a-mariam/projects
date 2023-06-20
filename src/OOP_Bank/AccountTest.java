package OOP_Bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account maryAccount = new Account("mary","paul","2005");

    @Test
    public  void testThat_AccountExist(){
    Account account = new Account("Mariam","Ambali","5423");

}
    @Test
    public void testThat_AccountNumber_Exist(){
    Account account = new Account("mary","paul","8970");
    account.getAccountNumber();
    }
    @Test
    public void testThat_AccountCan_Deposit(){
   // Account account = new Account("mary","john","4563");
    maryAccount.deposit(2000);
    assertEquals(2000,maryAccount.getBalance("2005"));
    }
    @Test
    public void testThat_DepositMethod_DoesNot_DepositNegative_Number(){
    // maryAccount = new Account("mary","paul","2005");
    maryAccount.deposit(2000);
    maryAccount.deposit(-200);
    assertEquals(2000,maryAccount.getBalance("2005"));
    }
    @Test
    public void testThat_Withdraw_can_Withdraw(){
        maryAccount.deposit(1000);
    maryAccount.withdrawCash(300,"2005");
    assertEquals(700,maryAccount.getBalance("2005"));
    }
    @Test
    public  void testThat_WithdrawMethod_DoesNot_Withdraw_NegativeAmount(){
        maryAccount.deposit(1000);
        maryAccount.withdrawCash(-300,"2005");
        assertEquals(1000,maryAccount.getBalance("2005"));
    }
    @Test
    public void testThat_Withdraw_With_WrongPin_BalanceIS_Still_Same(){
        maryAccount.deposit(2000);
        maryAccount.withdrawCash(1000,"3455");
        assertEquals(2000,maryAccount.getBalance("2005"));
    }
    @Test
    public void testThat_getBalance_works(){
        maryAccount.deposit(2000);
        maryAccount.getBalance("2005");

    }
}