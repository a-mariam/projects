package DataStructureAndAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    @Test
    public void testThat_SetExist(){
        Set set = new Set(5);
        assertNotNull(set);
    }
    @Test
    public void  testThat_SetIs_Empty(){
        Set set = new Set(5);
        assertTrue(set.isEmpty());
    }
    @Test
    public void testThat_Element_CanBe_Add_ToA_Set(){
        Set set = new Set(5);
        set.addElement("");
    }
}
