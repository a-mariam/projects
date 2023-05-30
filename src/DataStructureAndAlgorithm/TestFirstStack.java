package DataStructureAndAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static  org.junit.jupiter.api.Assertions.assertTrue;
public class TestFirstStack {
    @Test
    public void stackExist(){
        Mystack stack = new Mystack(5);
        assertNotNull(stack);
    }
@Test
    public void testThatIsEmpty(){
        Mystack stack = new Mystack(5);
        assertTrue(stack.isEmpty());
}
@Test
    public void test_That_IfPush_Stack_ShouldNot_BeEmpty(){
        Mystack stack = new Mystack(5);
        stack.push("Map");
}
@Test
    public void test_That_IfPop_Stack_Should_Decrease(){
        Mystack mystack = new Mystack(6);
        mystack.push("Map");
        mystack.pop("Map");

}

}
