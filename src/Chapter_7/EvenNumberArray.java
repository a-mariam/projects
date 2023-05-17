package Chapter_7;

public class EvenNumberArray {
    public static void main(String[] args) {
        int [] array = new int[10];
        System.out.printf("%s\t\t%s", "Index", "Value");
        System.out.println(" ");
        for(int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;

            System.out.printf("%5d%8d%n", counter, array[counter] );
        }
    }
}
