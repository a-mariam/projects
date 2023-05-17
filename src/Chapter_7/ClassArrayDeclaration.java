package Chapter_7;

import java.util.Arrays;

public class ClassArrayDeclaration {
    public static void main(String[] args) {
        int array[] = new int[10];
       // System.out.println(array);
        array[2] = 39;
        //System.out.println(array);
        System.out.println(Arrays.toString(array));
     int number [] = new int[9];
        System.out.println(ClassArrayDeclaration.toString(number));
    }

    protected static String toString(int[] array) {
        String arrayRepresentation = "[";
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1) arrayRepresentation += array[index] + ",";
            else arrayRepresentation += arrayRepresentation += array[index];
        }
        arrayRepresentation += "]";
        return arrayRepresentation;

    }
}