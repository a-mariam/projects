package Chapter_7;


import java.util.Arrays;

public class MethodArray {
   int [] number = new int[12];
   public static int[] check(int [] number){
     for(int index = 0; index < number.length;index++) {
       number[index] = index + 1;
     }
     System.out.println(Arrays.toString(number));
     return number;

   }



}
