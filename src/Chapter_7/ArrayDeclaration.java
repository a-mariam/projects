package Chapter_7;

public class ArrayDeclaration {
    public static void main(String[] args) {
        int [] myArray = new int [10];
        System.out.printf("%s\t%s%n", "Index", "Value");
        for(int counter = 0; counter < myArray.length; counter++){
            System.out.printf("%5d%8d%n", counter , myArray[counter]);
        }
    }
}
