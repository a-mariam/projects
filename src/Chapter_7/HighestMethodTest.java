package Chapter_7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HighestMethodTest {
    int [] many = {2, 4, 56, 77,74, 9};
@Test
    public void testHighestInAList(){
    HighestMethod.highestInLIst(many);
    assertEquals(HighestMethod.highestInLIst(many),HighestMethod.highestInLIst(many));
}
@Test
    public void testLowestInAArray(){
    HighestMethod.lowest0fArrayList(many);
    assertEquals(HighestMethod.lowest0fArrayList(many),HighestMethod.lowest0fArrayList(many));
}
@Test
    public void testMaximunAndMinimun(){
    HighestMethod.maximunAndMinimunInArray(many);
    assertEquals(HighestMethod.maximunAndMinimunInArray(many),HighestMethod.maximunAndMinimunInArray(many));
}

}