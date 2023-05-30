package DataStructureAndAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    List<String> myList = new ArrayList<>();

    @Test
    @BeforeEach public  void testThat_ArrayList_Exist(){
         myList = new ArrayList<>(5);
         assertNotNull(myList);
    }
    @Test
    public void testThat_ArrayList_isEmpty(){
        assertTrue(myList.isEmpty());
    }
    @Test
    public void TestThat_Element_CanBe_Added_ToThe_List(){
        myList.add("name");
    }


}