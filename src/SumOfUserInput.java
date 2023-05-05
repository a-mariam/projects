import java.util.Scanner;
public class SumOfUserInput {
 public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
     for(int count = 1; count <= 5 ; count ++){
         System.out.println("Enter a score ");
         int score = input.nextInt();
         total = total + score;
     }


      System.out.print("total = " + total );
    }
}