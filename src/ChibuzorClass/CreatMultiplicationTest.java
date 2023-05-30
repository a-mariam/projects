package ChibuzorClass;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatMultiplicationTest {
    @Test
    public void testCreatMultiplication(){
        int first = -10;
        int second = 12;
        int ans = -120;
       assertEquals(ans,Multiplication.multiply(first,second));
    }

}
