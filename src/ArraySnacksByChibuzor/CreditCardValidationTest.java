package ArraySnacksByChibuzor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidationTest {
    char [] sample = {3,7,3,5,3,2,4,6,2,1,6};
@Test
public void testCardType_OnlyTakes_Numbers_Between_13_and_16( ){
    String sample = "34567878";
    String sample1 = "263738683893738899";
    String sample2 = "0754658598595877";
    CreditCard.cardType(sample);
    CreditCard.cardType(sample1);
    CreditCard.cardType(sample2);
}

    @Test
public void testCardLength(){
        CreditCard.cardLength(sample);
}

@Test
    public void testCreditCard(){
    assertEquals(CreditCard.isCardValid("5061041735230556630"),CreditCard.isCardValid("5061041735230556630"));
}
@Test
    public void testCreditCardValidation(){
    CreditCard.creditCardValidation();
}

}