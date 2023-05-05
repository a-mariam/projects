package Chapter_7;

public class MethodOverload {
    private int num;
    public int add(int a, int c,int b){
        return a + b + c;
    }
    public int add(int a, int b){
        return a + b ;
    }
    public double add(int a, double b){
        return a + b;
    }
}
