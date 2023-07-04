package ClassChapters;

import java.lang.reflect.Type;
import java.util.Arrays;

public class SpreadingAnArray {

    public static void spread(int [] array) {
        String  s = "";
        for (int count = 0; count < array.length; count++){
            s += array[count];
        }
        System.out.println(s);
      char [] result = new char [s.length()];
        for (int count = 0 ; count < s.length();count++){
            result[count] += count;
        }
       char  [] w = Arrays.toString(result).toCharArray();
        System.out.println(s);
        System.out.println();
        System.out.println(w);

       // return Arrays.toString(result).toCharArray();

    }

    public static void main(String[] args) {
        int [] sample = {10, 25, 43, 62, 12};
        String [] expected = {"1","0","2","5","4","3","6","2","1","2"};
       spread(sample);
    }
}
