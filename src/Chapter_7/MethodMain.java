package Chapter_7;

import java.util.Scanner;

public class MethodMain {
    public static void main(String[] args) {
        MethodOverload method = new MethodOverload();
        System.out.println(method.add(3,4,5));
        System.out.println(method.add(7,2));
        System.out.println(method.add(6,29.7));
        Scanner input = new Scanner(System.in);
        System.out.println("enwr int");
        int nit = input.nextInt();
        input.nextLine();
        System.out.println("enter ll");
        String ll = input.nextLine();

    }
}
