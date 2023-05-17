public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 10;
        modify(number);
        System.out.println(number);
    }
    public static void modify(int num){
        num = 40;
        System.out.println(num);
    }
}