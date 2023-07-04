package DataStructureAndAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

    @Test
    public void testThatFruitListExist(){
        List fruit = new List(5);
        assertNotNull(fruit);

    }
    @Test
    public void testThatFruitIsEmpty(){
        List fruit = new List(4);
        assertTrue(fruit.isEmpty());
    }
    @Test
    public void testThatFruitCanAddElement(){
        List fruit = new List(5);
        fruit.add(2, "man");
        assertEquals(1,fruit.size());

    }
    @Test
    public void testThatListCanAddTwoElement(){
        List orange = new List(6);
        orange.add(0,"apple");
        orange.add(1,"lime");
        orange.add(2,"lemon");
        assertEquals(3,orange.size());
    }
    @Test
    public  void testGetSize(){
        List fruit = new List(6);
        assertEquals(0,fruit.size());
    }
    @Test
    public  void testTheClearMethod(){
        List fruit = new List(5);
        fruit.add(0,"mango");
        fruit.add(1,"pear");
        fruit.add(2,"dates");
        fruit.clear();
    }

   @Test
    public void testThat_Element_CanBe_Remove_From_A_Particular_Index(){
        List fruits = new List(7);
       fruits.add(2,"mango");
       fruits.add(0,"apple");
       fruits.add(1,"orange");
       assertEquals(3, fruits.size());
       fruits.remove(1);
       assertEquals(2, fruits.size());
   }

}
