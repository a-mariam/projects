import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("N\tN2\tN3\tN4");


        for (int number = 1; number <= 5; number = number +1) {
            int count = number * number;
            int power = number * number * number;
            int  count2 = number * number * number * number;

                System.out.printf("%d\t%d\t%d\t%d\t%n" , number , count , power, count2 );
            }

        }

    }
