package OOP_Bank;


import java.util.IllegalFormatCodePointException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private  static final Scanner keyboardInput = new Scanner(System.in);
   private static final Bank bank = new Bank();
    public static void main(String[] args) {

      bankMenu();
    }


     public static void bankMenu(){

        String mainMenu = """
                
                Welcome to Ocean Bank
                1.Create an Account
                2.Withdraw Cash
                3.Deposit Money
                4.Check Account Balance
                5.Transfer Money
                6. Exist
                """;
        String user = "";

            while (user.isEmpty()) {
//                while(user.chars()){
//
//                }
                try{
                user = input(mainMenu);

                switch (user.charAt(0)) {
                    case '1' -> createAnAccount();
                    case '2' -> withdrawCash();
                    case '3' -> depositMoney();
                    case '4' -> checkAccountBalance();
                    case '5' -> transferMoney();
                    case '6' -> exist();
                }
            }catch(StringIndexOutOfBoundsException ex){
                display("Enter a number!! ");

            }
        }
     }
     public static void menu2() {
         String todo = """
                 1. Deposit Money
                 2. Withdraw Cash
                 3. Check Account Balance
                 4. Transfer Money
                 5. Exist""";
         String userRespond = input(todo);
         switch (userRespond.charAt(0)) {
             case '1' -> depositMoney();
             case '2' -> withdrawCash();
             case '3' -> checkAccountBalance();
             case '4' -> transferMoney();
         }
     }


    public static void createAnAccount() {

         String  firstName = input("Enter your first Name: ");
         String lastName = input("Enter your last Name: ");
         String phoneNumber   = input("Enter our Phone Number:  ");
         String  pin = input("Enter pin: ");
         while(firstName.isEmpty()) {
             firstName = input("Name Can not Be Empty!!\n " + "ENTER YOUR FIRST NAME:  ");
         }
         while (lastName.isEmpty()){
             lastName = input("Name Can not Be Empty!!\n " + "ENTER YOUR LAST NAME:  ");
         }
        while (phoneNumber.isEmpty()){
            phoneNumber = input("Phone Number Can not Be Empty!!\n" + "ENTER YOUR PHONE NUMBER:  ");
        }
        while (pin.isEmpty()){
            pin = input("Pin Can not Be Empty!!\n" + "ENTER YOUR PIN: ");
        }
             bank.registerCustomer(firstName, lastName, pin, phoneNumber);
            display("Welcome " + firstName.toUpperCase() + " " + "Your Account has been register!!");
                display("Your Account Number is: " + bank.generateAccountNumber(phoneNumber));
                display("What would you like to do today: ");
                bankMenu();

     }
 public static void collectCustomerInformation(){
        display("Enter your first Name: ");
        String firstName = input(keyboardInput.nextLine());
 }


     public  static void depositMoney(){
        display("To deposit Money");
        String accountNumber = input("Please enter your Account Number: ");
        String collectAmount = input("PLease enter Amount: ");
        int amount = 0;
        try {
             amount = Integer.parseInt(collectAmount);
        }catch (NumberFormatException ex){
            System.out.println("Please enter Amount");
        }
        bank.deposit(accountNumber,amount);
        display("what would you like do today");
        bankMenu();
     }

     public static void withdrawCash(){
        String pin = input("Please Enter your pin: ");
        String accountNumber = input("Please enter your Account Number: ");
        String collectAmount = input("Please enter amount: ");
        while(pin.isEmpty()) {
            pin = input("PLEASE ENTER YOUR PIN: ");

        }
        int amount = 0;
        try {
             amount = Integer.parseInt(collectAmount);
        }catch (NumberFormatException ex){
            System.out.println("Please Enter Amount..");
        }
        bank.withdraw(pin,accountNumber,amount);
        display("what would you like to do");
        bankMenu();
        
     }
     public  static void checkAccountBalance(){
        String pin = input("Please Enter your pin: ");
        String accountNumber = input("Please Enter Account Number: ");
        while(pin.isEmpty()){
            pin = input("PLEASE ENTER YOUR PIN: ");
        }
        while(accountNumber.isEmpty()){
            accountNumber = input("PLEASE ENTER ACCOUNT NUMBER: ");
        }
        display("Your Current Balance is: " + bank.CheckBalance(pin,accountNumber));

        display("  ");
        display("what would you like to do");
        bankMenu();
     }
    public static void transferMoney(){
        String senderAccount = input("Enter your Account Number: ");
        String receiverAccount = input("Enter Receiver Account Number: ");
        String amount = input("Enter Amount: ");
        String pin = input("Enter your pin: ");
        while(senderAccount.isEmpty()){
            senderAccount = input("PLease Enter Your Account Number:  ");
        }
        while(receiverAccount.isEmpty()){
            receiverAccount  = input("PlEASE ENTER RECEIVER ACCOUNT NUMBER: ");
        }
        while (amount.isEmpty()){
            amount = input("PLEASE ENTER AMOUNT: ");
        }
        while(pin.isEmpty()){
            pin = input("PLEASE ENTER YOUR PIN: ");
        }
        int amountToTransfer = 0;
        try {
             amountToTransfer = Integer.parseInt(amount);
        }catch (NumberFormatException ex){
            System.out.println("Amount cannot be empty");
        }
        bank.transfer(senderAccount,receiverAccount,pin,amountToTransfer);
        display("""
                <<<<<<<<>>>>>>>>
                <<<<<<<<>>>>>>>>>
                """);
        display("What would you like to do today");
        bankMenu();
    }
     public static String  input(String message){
        display(message);
        return keyboardInput.nextLine();
     }
     public static void display(String message){
         System.out.println(message);
     }
     public static void exist(){
        display("Thanks for using our application");
     }
}
