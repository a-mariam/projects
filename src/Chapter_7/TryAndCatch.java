package Chapter_7;

public class TryAndCatch {
    public static void main(String[] args) {
    try {
        int [] arr = {1, 2, 4, 8};
        System.out.println(arr[10]);
    }catch(ArrayIndexOutOfBoundsException ex){
        System.out.println(ex);
    }
    }
    int [] number = new int[12];
//    public static int [] maximunNumber(int [] number){
//        for(int count = 0;count < number.length;count++ ){
//
//        }

}
