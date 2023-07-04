package OOP_Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {


      BankAccount bankAccount = new BankAccount();

    @Test
    public void testThat_AccountExist(){
        BankAccount bankAccount = new BankAccount();

    }
    @Test
    public void testThat_AccountCan_Deposit(){
        bankAccount.deposit(1000);
    }
    @Test
    public  void testThat_AccountCan_Withdraw(){
        bankAccount.deposit(2000);
        bankAccount.withdraw("1425",100);
    }
}
