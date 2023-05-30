package ChibuzorClass;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TakesArrayReturnArrayTest {

@Test
    public  void testReturnArray(){
    int [] sample = {1,2,3};
    int[] expected = {1,2,3,0,0,0};
        TakesArrayReturnArray.returnsTwiceTheLength(sample);
        assertArrayEquals(expected,TakesArrayReturnArray.returnsTwiceTheLength(sample));
    }


}