package Chapter_7;

import java.util.Arrays;

public class Array_classWork {
    public static void main(String[] args) {

        int []array = new int[10];
     for(int count = 0; count < array.length;count++){
         array[count] = count + 1;
     }

        System.out.println(Arrays.toString(array));
    }

}