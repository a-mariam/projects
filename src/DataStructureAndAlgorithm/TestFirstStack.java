package DataStructureAndAlgorithm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

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
        stack.push("man");
        assertEquals(2,stack.size());
}
@Test
    public void test_That_IfStack_IsPop_Stack_Should_Decrease(){
        Mystack mystack = new Mystack(6);
        mystack.push("Map");
        mystack.pop();
        assertTrue(mystack.isEmpty());

}
@Test
    public void testThat_Stack_ShouldNot_BeEmpty_WhenPush_Twice_and_pop_Once(){
        Mystack mystack = new Mystack(5);
        mystack.push("man");
        mystack.push("woman");
        mystack.pop();
        assertFalse(mystack.isEmpty());

}
@Test
    public void test_top_stack(){
        Mystack mystack = new Mystack(5);
        mystack.push("G-String");
        mystack.push("H-String");
        mystack.push("k-String");
        mystack.top();
}
}
