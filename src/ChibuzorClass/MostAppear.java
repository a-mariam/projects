package ChibuzorClass;

public class MostAppear {
    public static int returnMostAppear(int[] array) {
        String collect = "";
        for (int count = 0; count < array.length; count++) {
            for (int counts = 0; counts < array.length;counts++){
                if(array[0] == counts){
                    collect += counts;
                }
            }
        }
            System.out.println(collect);

            return 2;

    }

    public static void main(String[] args) {
        int [] sample = {2,2,3,6,8,9,0,0,0};

        returnMostAppear(sample);
    }
}
