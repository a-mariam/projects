import java.util.Scanner;
public class SumofUserInput3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int total = 0;
        int average = 0;
        while (count <= 5) {
      System.out.println("Enter a number");
      int number = input.nextInt();
        if(number <= 100 && number >= 0){
            total = total + number;
            average = total / count;
        }
        count++;
        }

   System.out.println("total =" + total);
        System.out.println("average = " + average);
    }
}