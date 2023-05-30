package Chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class CollectUserInputArray {
    public static void main(String[] args) {
        int [] grades = new int [10];
        //double mann = 34.4;
       System  .out.println(maximunUserInput(grades));
       // System.out.println(inputs(mann));
       // System.out.println();
    }
    static Scanner input = new Scanner(System.in);
    int [] grades = new int [10];
    public static String maximunUserInput(int [] grade){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        for(int count = 0; count < grade.length; count++){
            grade[count] = input.nextInt();
        }
        for (int number = 0; number < grade.length;number++){
            
        }
        return "grades" + Arrays.toString(grade);
    }
    public static void inputs(double ... number){


    }

}
