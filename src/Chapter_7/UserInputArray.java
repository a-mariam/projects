package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] num = new int [5];
        for(int count = 0; count < num.length; count++) {
            System.out.println("Enter a number");
            num[count] = input.nextInt();
        }
            System.out.println(Arrays.toString(num));
        int sum = 0;
        for(int nu = 0; nu < num.length; nu++){
            sum  += num[nu];
        }
            System.out.println(sum);

    }
}
