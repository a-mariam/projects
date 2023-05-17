package Chapter_7;

import javax.print.DocFlavor;
import java.util.Arrays;

public class ArrayReverseAddition {
    public static void main(String[] args) {
        int [] count = {1, 2, 3 , 4};
        int [] counts = {1, 2, 5 , 6};
        //System.out.println(count[2]);

       reverseAndAddArray(count,counts);
    }
    int g = 43574;
    public static int [] reverseAndAddArray(int [] array1, int [] array2) {
        int addArray1 = 0;
        int addArray2 = 0;
        int sumOfTwoArray = 0;
        int [] y = {6,7};


        for (int count = 0; count <= array1.length - 1; count++) {
            addArray1 += array1[count];


        }
        for (int count2 = 0; count2 <= array2.length - 1; count2++) {
            addArray2 += array2[count2];

        }

        sumOfTwoArray =  addArray1 + addArray2;
       // System.out.println(sumOfTwoArray);
        String collectNumber = Integer.toString(sumOfTwoArray);
        String u = "";
        for (int count = collectNumber.length(); count >= 0; count--){
            u += collectNumber.toString();
        }
        System.out.println(u);
       int [] newArray = new int[collectNumber.length()];
        for (int count = 0; count < newArray.length - 1;count++){
            newArray[count] = Integer.parseInt(String.valueOf(collectNumber.charAt(count)));
        }
        int reminder = 0;
        for(int count = 0; count <= sumOfTwoArray;count++){
            reminder = sumOfTwoArray % 10;
            collectNumber += reminder;
            sumOfTwoArray = sumOfTwoArray / 10;
          //  System.out.println(collect);
        }
               System.out.println(sumOfTwoArray);
        System.out.println(collectNumber);
      int an = Integer.parseInt(collectNumber);
       System.out.println(an);
       // int [] aa = Arrays.toString(an);
      int []  ans = new int[collectNumber.length()];
       int counter =0;
        for (int count = ans.length - 1; count > 0 ; count --){
           // ans[(count] += ans;
            //ans[counter] += Integer.parseInt(String.valueOf((collectNumber.charAt(Arrays.toString(count)))));
          //  ans[count] = Character.getNumericValue(collectNumber.charAt(count));
            counter++;
        }
        counter ++;
   //     int [] n = Arrays.toString(ans);
    // int [] ans  = ans.getClass().getSimpleName();
             //System.out.println(Arrays.toString(ans));
      //  System.out.println(ans);
////
// sout
// int [] ansArray = new int [String.valueOf(an).length() ];
//        int i = String.valueOf(an).length() -1;
//        do {
//            ansArray[i] = ansArray % 10;
//            ansArray = ansArray / 10;
//        }
    //   int [] ann = Arrays.toString(collectNumber);
       // String.toCa
        //System.out.println(an);
        //int [] anss = ;
        //System.out.println(Arrays.toString(an));

//        String sum = Integer.toString(sumOfTwoArray);
//        int[] reversedSum = new int[sumOfTwoArray];
//        int [] sumOfUser = new int[sumOfTwoArray];
//        int [] newarray = new int[sumOfUser.length];
//        System.out.println(sumOfTwoArray);
//        System.out.println(Arrays.toString(sumOfTwoArray));
//        System.out.println(Arrays.toString());
//        int counter = 0;
//        for (int count = sumOfUser.length - 1; count >= 0; count--) {
//           newarray[(sumOfUser.length -1)- count] = sumOfUser[count];
//            System.out.printf("%d ",count, sumOfUser[count]);
//            counter++;
//            System.out.println(sumOfUser[count]);

       // }
        System.out.println(Arrays.toString(newArray));
        return newArray;

      //  return Arrays.toString(ans);
    }
}
