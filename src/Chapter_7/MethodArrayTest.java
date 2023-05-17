package Chapter_7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MethodArrayTest {
    //int [] nn = new int[12];
    int[] man = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int [] yy = new int[100];
    int [] worknumber = new int[200];
    @Test
    public void testCheck() {
           int [] tess = new int [8];
        int[] array2ndOption = new int[6];
        MethodArray.check(tess);
        int[] newArrayAsResult = {1, 2, 3, 4, 5, 6};
            assertEquals(Arrays.toString(tess), Arrays.toString(MethodArray.check(tess)));
        }
@Test
    public void testThatMethodWorks(){
        int [] number = MethodArray.check(worknumber);
    for (int index = 0; index < worknumber.length; index++) {
        assertEquals(index+ 1, number[index]);
    }
}
    }
