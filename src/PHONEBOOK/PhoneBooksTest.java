package PHONEBOOK;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


    public  class PhoneBooksTest {
        @Test
        public void testThat_PhoneBook_Exist(){
            PhoneBooks phonebook = new PhoneBooks();
            assertNotNull(phonebook);
        }
        @Test
        public void testThat_ThatAll_PhoneBook_IsLocked_ByDefault(){
//            Phonebook phone = new Phonebook("mariam","pass");
//            Phonebook ph = new Phonebook("mary","passs");
//            Phonebook phs = new Phonebook("man","mans");
//            assertEquals(true,phone.isLock());
//            assertEquals(true,ph.isLock());
//            assertEquals(true,phs.isLock());
        }

        @Test
        public void test_ReturnAll(){
            PhoneBooks phone = new PhoneBooks();
            phone.addPhoneBook("name","123");
            phone.addPhoneBook("nams","111");
            assertEquals(2,phone.size());
        }
    }
