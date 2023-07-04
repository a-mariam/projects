package OOP_Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;
    @Test
    public void testThat_Bank_IsNot_Exist(){
        assertNotNull(bank);
    }
    @BeforeEach public void init(){
         bank = new Bank();
    }
  //  @Test
 //   public void testThat_Account_Has_A_Name(){
  //      bank.setAccountName("firstName","secondName");
//    }
    @Test
    public void testThat_getAccountName_Method(){
        //bank.getAccountName();
        String expected = "7044063892";
        //assertEquals(expected,bank.generateAccountNumber());
    }

@Test
public void testThat_Account_Can_Generate_AccountNumber(){
        bank.generateAccountNumber("07044063892");
    String expected = "7044063892";
    assertEquals(expected,bank.generateAccountNumber("07044063892"));

}
    @Test
    public void  testThat_Bank_Can_Register_Customer(){
        bank.registerCustomer("mariam","ambali","7654","07044063892");
        assertEquals(1, bank.getAccountSize());
    }
    @Test
    public void  testThat_Bank_Can_Register_Customers(){
        bank.registerCustomer("mariam","ambali","7654","07044063892");
        bank.registerCustomer("mariam","ambali","7654","07044063892");
        assertEquals(2, bank.getAccountSize());
    }
@Test
    public void test_Get_Account_Size(){
        bank.registerCustomer("many","mama","1233","09077565757");
        assertEquals(bank.getAccountSize(),1);
    }

    @Test
    public  void testThat_Bank_Can_Deposit(){
        bank.registerCustomer("mariam","ambali","7654","07044063892");
        bank.deposit("7044063892", 1000);
        bank.CheckBalance("7654","7044063892");
        assertEquals("Your current balance is: 1000.0",bank.CheckBalance("7654","7044063892"));
    }
    @Test
    public void  testThat_Bank_Can_Withdraw(){
        bank.registerCustomer("peter","paul","2005","08055958617");
        bank.deposit("8055958617",5000);
        bank.withdraw("2005","8055958617",2000);
        assertEquals("Your current balance is: 3000.0",bank.CheckBalance("2005","8055958617"));
    }
    @Test
    public void testThat_BankCan_GetBalance(){
        bank.registerCustomer("Mariam","Ambali","2005","07044063892");
        bank.deposit("8055958617",10000);
        bank.CheckBalance("2005","7044063892");
    }
    @Test
    public void testThat_Bank_Can_Transfer(){
        bank.transfer("7044063892","807788584","2005",400);

    }
}
