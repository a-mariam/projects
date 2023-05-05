import java.util.Scanner;
public class SumOfUserInput4 {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        int count = 1;
        int total = 0;
        int validnumbers = 5;
        while(count <= 5){
            System.out.println("Enter a number");
            int number = user.nextInt();
            if(number >= 0 && number <= 100 && number == validnumbers ) {
                total = total + number;
            }
            count++;
        }
        System.out.println("total = " + total);
    }

}
