package JennyClass;
import java.util.Scanner;
public class UserInput5Times {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = user.nextInt();
        int result = number;
        for (int count = 0; count < 4;) {
            result = result * number;
            count++;
        }
            System.out.println(result);
        }
    }

