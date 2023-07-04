package PHONEBOOK;

import java.util.Objects;

public class Phonebook {


        private String name;
        private String passWord;
        private boolean unlock = false;
        public Phonebook(String userName, String passWord) {
            this.name = userName;
            this.passWord = passWord;
        }

        public void unlock(String password){
            if (Objects.equals(this.passWord,password)){
                unlock = false;
            } else {
                unlock = true;
            }
        }
        public boolean isLock(){
            return true;
        }

    }


