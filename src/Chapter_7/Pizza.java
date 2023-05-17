package Chapter_7;

import java.util.Arrays;

public class Pizza {
    public static void main(String[] args) {
        int[] pizza = new int[100];

        for (int count = 0; count < pizza.length; count++) {
            pizza[count] =  5;
        }
            System.out.printf(Arrays.toString(pizza));
        }
    }
