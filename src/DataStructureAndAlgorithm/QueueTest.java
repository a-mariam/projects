package DataStructureAndAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void testThat_Queue_Exist(){
        Queue queue = new Queue(5);
        assertNotNull(queue);
    }
    @Test
    public void testThat_QueueIs_Empty(){
        Queue queue = new Queue(5);
        assertTrue(Queue.isEmpty());
    }
    @Test
    public void testThat_YouCan_AddTo_AQueue(){
        Queue queue = new Queue(5);
        queue.enQueue("one");
    }
@Test
    public  void testThat_youCan_RemoveFrom_AQueue(){
        Queue me = new Queue(5);
        me.enQueue("element");
        me.enQueue("two");
        me.deQueue("element");
}

}
