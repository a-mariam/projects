public class KuliTech {
    // public static void main(String[] args){
    private int price;

    public int getPrice(int price2, int price) {
        return this.price = price;
    }

    public void setprice() {

    }


    public static void main(String[] args) {
        String x;
        String name = "Kuli" + " " + "Tech";
        System.out.println(name);
        String stringNumber = "Kuli" + 2;
        System.out.println(stringNumber);

        int y = 5;
        x = "y + 2 =" + y + 2;
        System.out.println(x);
        System.out.println(Math.max(2, 7));

        int result = getMaximumNumber(5,6,7);
        System.out.println(result);
        int min = getMinimumNumber(8,2,6);
        System.out.println(min);
    }
        public static int getMaximumNumber(int num1, int num2, int num3){
            return Math.max(num1, Math.max(num2, num3));
        }
        public static int getMinimumNumber(int num1,int num2,int num3){
        return Math.min(num1,Math.min(num2,num3));
        }


}