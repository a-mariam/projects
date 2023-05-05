import java.util.Scanner;
public class LanguageApp {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
       System.out.println("press 1 for English");
        System.out.println("Press 2 for yoruba");
        System.out.println("Press 3 for igbo");
        System.out.println("Press 4 for hausa");
        String input = userInput.nextLine();

        switch( input ){
            case"1":
                System.out.println("English");
                break;
            case"2" :
                System.out.println("yoruba");
                break;
            case"3" :
                System.out.println("igbo");
                break;
            case"4":
                System.out.println("hausa");
                break;
        }

    }

}
