package ArraySnacksByChibuzor;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsernameGeneratorTest {
    @Test
    public void testThat_usernameGenerator_Exit(){
        UsernameGeneration.usernameGenerator("Mariam@gmail.com");
        assertNotNull(false);
    }
    @Test
    public  void testThat_usernameGenerator_Only_takes_String(){
        UsernameGeneration.usernameGenerator("Mariam@gmail.com");
    }
    @Test
    public void testThat_usernameGenerator_return_username(){
        String expected = "Mariam";
        UsernameGeneration.usernameGenerator("Mariam@gmail.com");
        assertEquals(expected,UsernameGeneration.usernameGenerator("Mariam@gmail.com"));
    }

}
