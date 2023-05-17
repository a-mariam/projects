package chapter2.chap2;

import Chapter_7.MethodArray;

import java.util.Arrays;

public class CompileTimeInitialization {
    public static void main(String[] args) {
        String [] names = new String []{"Esther", "Kulitech" , "Vicky", "Retner", "Onye", "Joy", "Sultan" , "Bright"};
        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names[names.length - 1]);
        System.out.println(names[names.length / 2]);
        int [] count = new int [5];
        count[0] = 3;
        count[1] = 4;
        count[2] = 5;
        count[3] = 6;
        count[4] = 8;
        System.out.println(count);
        System.out.println(Arrays.toString(count));
        System.out.println(MethodArray.check(count));
    }
}
