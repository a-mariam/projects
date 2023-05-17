package Chapter_7;

import java.util.Arrays;

public class Array7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[5];
        arr[3] = new int[]{300, 444};

        for (int count = 0; count < arr.length; count++) {
            for (int counts = 0; counts < arr[count].length; counts++) {
                arr[count][counts] = counts;
                if (count == arr.length - 2) {
                    arr[count][counts] = count  * 100 ;
                    count++;
                }
                if (count == arr.length -1){
                    int num = 100;
                    if (counts >= 0) arr[count][counts] =  1 * 100 ;
                    if (counts>= 1) arr[count][counts] = 2 * 100 ;
                    if (counts>= 2) arr[count][counts] = 3 * 100 ;
                    if (counts>= 3) arr[count][counts] = 4 * 100 ;
                    if (counts>= 4) arr[count][counts] = 5 * 100;


                }
            }

        }

        System.out.println(Arrays.deepToString(arr));
    }
}
