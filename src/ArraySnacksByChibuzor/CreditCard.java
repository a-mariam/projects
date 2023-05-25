package ArraySnacksByChibuzor;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {


    public static String cardType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card Details to verify");
        String numbers = scanner.nextLine();
      char []   number = numbers.toCharArray();
        int first = Character.getNumericValue(number[0]);
        int second = Character.getNumericValue(number[1]);
       // if (number.length <= 16 && number.length >= 13) {
            if (first == 4) {
                System.out.println("Credit Card Type: Visa Cards");
            }
            if (first == 5) {
                System.out.println("Credit Card Type: MasterCard");
            }
            if (first== 3 && second == 7) {
                System.out.println("Credit Card Type: American Express Cards");
            }
            if (first == 6) {
                System.out.println("Credit Card Type: Discover cards");
            } else {
                System.out.println("Credit Card Type: Invalid Card");
            }
      //  }
        System.out.println(first);
        System.out.println(second);
            System.out.println("Credit Card Number: " + numbers);
            return numbers;

    }


    public static void cardLength ( char[] cardNumber){
        int length = cardNumber.length;
        System.out.printf("%s%d%n", "Credit Card Digit Length: ", length);
    }

    public static String isCardValid (String number){
        char[] array = number.toCharArray();
        String secondDigits = "";
        for (int count = array.length - 2; count >= 0; count -= 2) {
            secondDigits += array[count];
        }
        String odd = "";
        for (int count = 0; count <= array.length; count += 2) {
            odd += array[count];
        }
        int secondDigitsToInt = Integer.parseInt(secondDigits);
        int oddToInt = Integer.parseInt(odd);
        int collectSecond = 0;
        int sum1 = 0;
        int collectOdd = 0;
        int sumOdd = 0;
        while (secondDigitsToInt != 0) {
            int correct = 0;
            int addcorrect = 0;
            collectSecond = secondDigitsToInt % 10;
            sum1 += collectSecond * 2;
            if (collectSecond >= 10) {
                correct = collectSecond % 10;
                addcorrect += correct;
                collectSecond = collectSecond / 10;
                collectSecond = addcorrect;
            }
            secondDigitsToInt = secondDigitsToInt / 10;
        }
        while (oddToInt != 0) {
            collectOdd = oddToInt % 10;
            sumOdd += oddToInt;
            oddToInt = oddToInt / 10;
        }
        int summation = 0;
        summation = sum1 + sumOdd;
        if (summation % 10 == 0) {
            System.out.println("Credit Card Validity Status: Valid");
        } else {
            System.out.println("Credit Card Validity Status: Invalid");
        }

        return "";
    }

    public  static void creditCardValidation(){
       char [] r = {2,1,3,4,5,6,5,6,5,3,5,5,6,7,7,5};
       isCardValid("1234567892345678");
    }

        public static void main (String[]args){
    char [] n = {3,7,7,9,4,2,1,5,7,6,5,6};
    String m = "77942157656";
    //cardType();
    cardLength(n);
    isCardValid(m);
        }
    }

