package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class CalciulateAverageInArray {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int[] array = new int[5];
        double  total = 0;
        double average  = 0;
        for (int count = 0; count < array.length; count++) {
            if (count == 0) {
                System.out.println("Enter 1st number: ");
            }
            if ( count == 1){
                System.out.println("Enter 2nd number");
            }
            if (count == 2){
                System.out.println("Enter 3rd number");
            }
            if (count == 3){
                System.out.println("Enter 4th number");
            }
            if (count == 4 ){
                System.out.println("Enter 5th number");
            }
            array[count] = user.nextInt();
            total += array[count];
            average = total / array.length;
        }
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

    }
}
