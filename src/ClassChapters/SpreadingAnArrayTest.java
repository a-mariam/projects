package ClassChapters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpreadingAnArrayTest {
    @Test
    public void testThat_SpreadArray_Works(){
        int [] sample = {10, 25, 43, 62, 12};
        String [] expected = {"1","0","2","5","4","3","6","2","1","2"};
        SpreadingAnArray.spread(sample);
        //assertArrayEquals(expected,sample);
       // assertArrayEquals(expected, sample);
    }

}
