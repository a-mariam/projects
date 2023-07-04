package ChibuzorClass;

import org.junit.jupiter.api.Test;

public class MostAppearTest {
    int [] array = new int[5];
    @Test
    public  void testThat_ReturnMostAppear_Exist(){
        MostAppear.returnMostAppear(array);
    }
    @Test
    public void testThat_returnMost_Appear_only_collect_Array(){
        MostAppear.returnMostAppear(array);
    }
}
