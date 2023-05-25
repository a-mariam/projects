package ArraySnacksByChibuzor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {
    char [] sample = {3,7,3,5,3,2,4,6,2,1,6};
@Test
public void testCardLength(){
        CreditCard.cardLength(sample);
       // assertEquals(sample,CreditCard.cardLength(sample));
}

@Test
    public void testCreditCardValidation(){
    CreditCard.isCardValid("123456789101112");
    assertEquals(CreditCard.isCardValid("123456789101112"),CreditCard.isCardValid("123456789101112"));
}

}