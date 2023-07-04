package ClassChapters;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeBarChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        int grades;
        int counts;
        for (int count = 0; count < array.length; count++) {
            System.out.println("Enter your Grade: ");
            grades = scanner.nextInt();
            array[count] += grades;
            counts = array[count];
        }
       System.out.println("Array of Grades:");
        System.out.println(Arrays.toString(array));

        System.out.println();

        System.out.println("Grades Chat");
            for (int star = 0; star < array.length ; star++) {
                for (int count = 0;count <= array[star]; count++) {
                        System.out.print("*");
                }
                System.out.println();
            }
        }
}

