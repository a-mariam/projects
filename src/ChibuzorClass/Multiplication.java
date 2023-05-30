package ChibuzorClass;

public class Multiplication {

    public static int multiply(int number,int number2) {
       int answer = 0;
       for (int count = 0; count < number2; count++){
           answer+= number;
           if (number == 0 || number2 == 0){
               for (int counts =0;counts < number2;counts++){
                   answer -= number;
               }
               if (number == 0 && number2 == 0){
                   answer = 0;
               }
           }
       }
        System.out.println(answer);
        return answer;
    }
}
