package PHONEBOOK;

import java.util.ArrayList;

public class PhoneBooks {


        ArrayList<Phonebook> phonebooks = new ArrayList<>();
        ArrayList<String> password = new ArrayList<>();
        public void addPhoneBook(String userName, String passWord){
            Phonebook phone = new Phonebook(userName,passWord);
            phonebooks.add(phone);
            password.add(passWord);
        }
        public ArrayList<Phonebook> returnAll(){
            return phonebooks;
        }
        public void unlockAll(){
            for (int count = 0; count < phonebooks.size();count++){
                phonebooks.get(count).unlock(password.get(count));
            }

        }

    public int size() {
       return phonebooks.size();
    }
}

