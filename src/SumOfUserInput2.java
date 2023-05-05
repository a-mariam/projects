import java.util.Scanner;
public class SumOfUserInput2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 1;
        while( count <= 5) {
            System.out.println("Enter a number ");
            int number = input.nextInt();
            if(number <= 100 && number >= 0 ) {
                total = total + number;
            }

        count++;

        }
    System.out.println("total = " + total);

    }
}

