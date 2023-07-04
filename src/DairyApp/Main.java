package DairyApp;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static  final Scanner keyBoardInput = new Scanner(System.in);
    private  static Diary diary;



    public static void main(String[] args) {

    mainMenu();
    }

    public static void mainMenu(){
    String menu = """
            Welcome.....
            1.Create Diary
            2.Exist
            """;
    String userInput = "";
           while (userInput.isEmpty()) {
               try {
                   userInput = input(menu);
                   switch (userInput.charAt(0)) {
                       case '1' -> createDiary();
                       case '2' -> exist();
                   }
               }catch (StringIndexOutOfBoundsException ex){
                   display("Enter a number!!");
               }
           }
    }
    public static void createDiary(){
        String name = "";
        while (name.isEmpty()) {
            name = input("Enter your name: ");
        }
        String password = "";
        while(password.isEmpty()) {
            password = input("Enter your password: ");
        }
        diary = new Diary(name,password);
        display("Diary was created successfully....");
        unlock();
    }
    public static void diaryMenu(){
        String diaryMenu = """
       1.Create Gist
       2.View Diary By Title
       3.Delete Diary By Title
       4.Update Diary
       5.Exist
            """;
       String userInput = "";
            try {
                userInput = input(diaryMenu);

                switch (userInput.charAt(0)) {
                    case '1' -> createAGist();
                    case '2' -> viewDiaryByTitle();
                    case '3' -> deleteDiaryByTitle();
                    case '4' -> updateDiary();
                    case '5' -> exist();
                    //case '6' -> viewDiaryByTitle();
                    default -> diaryMenu();
                }
            } catch (StringIndexOutOfBoundsException ex) {
                display("Enter a number!!!");
            }
        }

    public static void createAGist(){
        String title = "";
        while (title.isEmpty()) {
            title = input("Enter a title: ");
        }
        String body = "";
        while (body.isEmpty()) {
            body = input("Enter Body:  ");
        }
        diary.creatEntry(title,body);
        System.out.print("Gist was created on: ");
        diary.generateTime();
        diaryMenu();
    }
    public static void unlock(){
        String password = "";
        while(password.isEmpty()){
            password = input("Enter password: ");
        }
        if (Objects.equals(diary.unlock(password), false)) {
            diaryMenu();
        }else {
        while (Objects.equals(diary.unlock(password), true)) {
            password = input("Enter password: ");
            if (Objects.equals(diary.unlock(password), false)) {
                diaryMenu();
            }
        }

        }
    }



    public static void viewDiaryByTitle(){
        String title = input("Enter gist title:  ");
        diary.viewDiaryByTitle(title);
        diaryMenu();
    }

    public static  void deleteDiaryByTitle(){
        String title = input("Enter gist Title:   ");
        diary.deleteEntry(title);
        diaryMenu();
    }
    public static  void updateDiary(){
        String title = "";
        String body = "";
        String id = "";
        while(title.isEmpty()) {
            title = input("Enter your title: ");
        }
        while (body.isEmpty()) {
            body = input("Enter Body: ");
        }
        while (id.isEmpty()) {
            id = input("Enter your id: ");
        }
        int ids = Integer.parseInt(id);
        diary.updateEntry(ids,title,body);
        diaryMenu();
    }
    public static void exist(){
        display("Thanks for using our application..");
    }
    public static void display(String message){
        System.out.println(message);
    }
    public static String input(String message){
        display(message);
        return keyBoardInput.nextLine();
    }
    }