package ArraySnacksByChibuzor;

import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {
    public static String cardType(String numbers) {
      char []   number = numbers.toCharArray();
        int first = Character.getNumericValue(number[0]);
        int second = Character.getNumericValue(number[1]);
        if (number.length <= 16 && number.length >= 13) {
            if (first == 4) {
                System.out.println("Credit Card Type: Visa Cards");
            } else if (first == 5) {
                System.out.println("Credit Card Type: MasterCard");
            } else if (first == 3 && second == 7) {
                System.out.println("Credit Card Type: American Express Cards");
            } else if (first == 6) {
                System.out.println("Credit Card Type: Discover cards");
            } else {
                System.out.println("Credit Card Type: Invalid Card Type");
            }
        } else if (number.length < 13) {
            System.out.println("Card length is too small");
        } else if (number.length > 16 ) {
            System.out.println("Card length is too long");
        }
        System.out.println("Credit Card Number: " + numbers);
            return numbers;
    }


    public static void cardLength ( char[] cardNumber){
        int length = cardNumber.length;
        System.out.printf("%s%d%n", "Credit Card Digit Length: ", length);
    }

    public static String isCardValid (String number){
        char[] array = number.toCharArray();
        if (number.length() >= 13 && number.length() <= 16) {
            String secondDigits = "";
            for (int count = array.length - 2; count > 0; count -= 2) {
                secondDigits += array[count];
            }
            String odd = "";
            for (int count = 0; count < array.length; count += 2) {
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
        }else if (number.length() < 13){
            System.out.println("Card Number length too short");
        }else if (number.length() > 16 ) {
            System.out.println("Card number length too long");
        }
        return "";
    }

    public  static  void creditCardValidation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card Details to verify");
        String numbers = scanner.nextLine();
        char [] digit = numbers.toCharArray();
        cardType(numbers);
        cardLength(digit);
        isCardValid(numbers);
    }

        public static void main (String[]args){
    creditCardValidation();
        }
    }

