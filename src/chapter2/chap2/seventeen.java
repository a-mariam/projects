package chapter2.chap2;
import java.util.Scanner;
public class seventeen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest =0;
        int lowest = 0;
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();
        int sum = firstNumber + secondNumber + thirdNumber;
        int average = firstNumber + secondNumber + thirdNumber / 3;
        int product = firstNumber * secondNumber * thirdNumber;
        if(firstNumber > secondNumber && firstNumber > thirdNumber){
             largest = firstNumber;
        }
        if(secondNumber > firstNumber && secondNumber > thirdNumber ){
            largest = secondNumber;
        }
        if(thirdNumber > firstNumber && thirdNumber > secondNumber){
            largest = thirdNumber;
        }
        if(firstNumber < secondNumber && firstNumber < thirdNumber){
            lowest = firstNumber;
        }
        if(secondNumber < firstNumber && secondNumber < thirdNumber){
            lowest = secondNumber;
        }
        if(thirdNumber < firstNumber &&  thirdNumber < secondNumber){
            lowest = thirdNumber;
        }
        System.out.printf("%d\t%d\t%d\t%d\t%d\t" , "sum =" ,sum , "average = ", average , product , largest , lowest);
    }



}
