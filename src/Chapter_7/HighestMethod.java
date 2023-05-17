package Chapter_7;

import java.util.Arrays;

public class HighestMethod {

    public static void main(String[] args) {
       int[] negative = {-1, -4, -9, -8};
        int[] numbers = {1, 3, 5, 6, 5, 1};
        System.out.println(highestInLIst(numbers));
        System.out.println(lowest0fArrayList(numbers));
        System.out.println(maximunAndMinimunInArray(negative));
    }

    int[] number = new int[10];

    public static String highestInLIst(int[] number) {
        int maximun = number[0];
        for (int count = 0; count < number.length; count++) {
            if (number[count] > maximun) {
                maximun = number[count];
            }

        }
        System.out.println(maximun);
        return "Maximun: " + maximun;
    }

    public static String lowest0fArrayList(int[] number) {
        int minimum = number[0];
        for (int count = 0; count < number.length; count++) {
            if (number[count] == 0) {
                if (number[count] < minimum) {
                    minimum = number[count];
                }
            }
        }
            System.out.println(minimum);
    return "Mininum: " + minimum;
}
    public static String maximunAndMinimunInArray(int [] number){
        int minimum = number[0];
        int maximun = number[0];
        for(int count = 0; count < number.length; count++){
            if(number[count] < maximun){maximun = number[count];}
            if(number[count] > minimum){ minimum = number[count];}

        }
        System.out.println(maximun + " " + minimum);
        return "maximum in the Array is: " + maximun + " " +  "minimum in the Array is: " + minimum;
    }


}