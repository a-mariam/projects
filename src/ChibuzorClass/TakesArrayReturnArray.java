package ChibuzorClass;

import java.util.Arrays;

public class TakesArrayReturnArray {
    public static int[] returnsTwiceTheLength(int[] array) {
        int[] newArray = new int[array.length * 2];
        for (int count = 0; count < array.length; count++) {
            newArray[count] += array[count];
        }
        return newArray;
    }
}
