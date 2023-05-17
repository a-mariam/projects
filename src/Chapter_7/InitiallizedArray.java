package Chapter_7;

public class InitiallizedArray {
    public static void main(String[] args) {
        int [] intiallized = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.printf("%s\t%s%n" , "Index" ,"Value" );
        for(int count = 0; count < intiallized.length;count++){
            System.out.printf("%5d%8d%n", count , intiallized[count]);
        }
    }
}
