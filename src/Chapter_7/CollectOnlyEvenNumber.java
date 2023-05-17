package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class CollectOnlyEvenNumber{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int [] evenNumber = new int[5];
        int evens = 0;
        for (int count = 0; count < evenNumber.length;){
            System.out.println("Enter Even Number");
            evens = user.nextInt();
            if (evens % 2 == 0) {
                evenNumber[count] = evens;
                count++;
            }
        }
        System.out.println(Arrays.toString(evenNumber));
    }


}
