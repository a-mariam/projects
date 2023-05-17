package JennyClass;

import java.util.Scanner;

public class SumOfSquareOfTwoNumber {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number1 = user.nextInt();
        System.out.println("Enter a number: ");
        int number2 = user.nextInt();
        int power1 = number1;
        int power2 = number2;
        int sum = 0;
        for (int count = 0; count < 4; ) {
            power1 = power1 * number1;
            power2 = power2 * number2;
            count++;
            sum = power1 + power2;
        }
        System.out.println("power11 = " + power1);
        System.out.println("power22 = " + power2);
        System.out.println("sum = " + sum);

        int counter = 0;
        while (counter < 4){
            power1 = power1 * number1;
            power2 = power2 * number2;
            counter++;
            sum = power1 + power2;
        }
        System.out.println("power1 = " + power1);
        System.out.println("power2 = " + power2);
        System.out.println("sum = " + sum);
    }

}