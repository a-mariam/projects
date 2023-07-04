package DataStructureAndAlgorithm;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Mystack {
    private int index;
    String [] elements;
    int size;
    public Mystack( int sizeOfStack) {
        elements = new String[sizeOfStack];
    }

    public boolean isEmpty() {
        if (index == 0){
            return true;
        }
        return false;
    }

    public void push(String element) {
     elements[index] = element;
     index++;
        System.out.println(Arrays.toString(elements));
    }
    public void  pop( ){
       index = index - 1;
       elements[index] = null;
        System.out.println(Arrays.toString(elements));
    }

    public String top() {
        String n = elements[index - 1];
        System.out.println(n);
        return n;
    }

    public int size() {
       //j for (int count )
        return  size;
    }
}
