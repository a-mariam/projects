package OOP_Bank;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {

    String accountNumber = "";

    ArrayList<Account> account1 = new ArrayList<>();


    public String generateAccountNumber(String phoneNumber) {

        if (phoneNumber.length() == 11){
            StringBuilder string = new StringBuilder(phoneNumber);
            string.deleteCharAt(0);
            accountNumber = String.valueOf(string);
            return accountNumber;
        }else {
            return  null;
        }
    }

    public void registerCustomer(String firstName, String lastName, String pin, String phoneNumber) {
       try{
        Account account = new Account(firstName, lastName, pin);
            if (generateAccountNumber(phoneNumber) != null) {
                account.setAccountNumber(generateAccountNumber(phoneNumber));
                account1.add(account);
            }
        } catch (NullPointerException ex){
            System.out.println("Number can not Empty");
        }catch (Exception ex){
           System.out.println("Account No Found");
       }

    }
    public  int getAccountSize(){
        return account1.size();
    }


    public Account findAccountByAccountNumber(String accountNumber) {
        for (Account acc : account1)
            if (acc.getAcountNumber().equals(accountNumber)) {
                return acc;
            }
        throw new NullPointerException("Account Not Found");
    }
  public boolean checkAccountNumber(String accountNumber){
        boolean check = false;
      for (Account account : account1) {
          if (Objects.equals(account.getAccountNumber(), accountNumber)) {
              check = true;
          }
      }
      throw new NullPointerException("Account Not Found");
  }
    public void deposit(String accountNumber, int amount){
     try{
       Account acc  =  findAccountByAccountNumber(accountNumber);
       if (Objects.equals(findAccountByAccountNumber(accountNumber), acc)){
           acc.deposit(amount);
           System.out.println("Your Deposit of " + amount + " was successful..." );
       }
       else {
           System.out.println("Your Deposition Was Not Successful..");
       }
     }
    catch (NullPointerException ex){
        System.out.println("Account Not Found!!");
    }
     catch (IllegalArgumentException ex){
         System.out.println("Invalid Amount");
     }

     }



    public String CheckBalance(String pin, String accountNumber) {

       try {
           Account account = findAccountByAccountNumber(accountNumber);
           if (Objects.equals(findAccountByAccountNumber(accountNumber),account)) {
               if (Objects.equals(account.validatePin(pin),pin)) {
                   return "Your current balance is: " + account.getBalance(pin);
               }else {
                   System.out.println("Incorrect pin");
               }
           }else {
               System.out.println("Account not found..");
           }
       }
       catch(NullPointerException e){
           System.out.println("Account Not Found");
       }catch (IllegalArgumentException ex){
           System.out.println("Incorrect pin");
       }

      return "";
    }

    public void tranfers(String accountNumber, int amount){
        try{
            Account acc  =  findAccountByAccountNumber(accountNumber);
            if (Objects.equals(findAccountByAccountNumber(accountNumber), acc)){
                acc.deposit(amount);
                System.out.println("Your Transfer of " + amount + " was successful..." );
            }
            else {
                System.out.println("Your Transfer Was Not Successful..");
            }
        }
        catch (NullPointerException ex){
            System.out.println("Receiver account is not Found!!");
        }
        catch (IllegalArgumentException ex){
            System.out.println("Invalid Amount");
        }

    }

    public void withdraw(String pin, String accountNumber, int amount) {
        try {
            Account acc = findAccountByAccountNumber(accountNumber);
              if (Objects.equals(findAccountByAccountNumber(accountNumber), acc)) {
            acc.withdrawCash(amount, pin);
            System.out.println("Your withdrawal of " + amount + " Was successful!!");
        }
    }
            catch (IllegalArgumentException ex) {
                System.out.println("Invalid Amount");
            }catch (NullPointerException ex){
            System.out.println("Account not found");
        }

    }

    public  void transfer(String accountNumber,String receiverAccountNumber, String pin,int amount) {
        try {
         Account   account = findAccountByAccountNumber(accountNumber);
            double transferMoney = 0;
            double balance = account.getBalance(pin);
            if (amount == balance || amount < balance) {
                tranfers(receiverAccountNumber, amount);
            } else {
                System.out.println("Invalid Amount!!");
            }
        } catch (NullPointerException ex) {
            System.out.println("Sender account's not found!!");
        } catch (Exception e) {
            System.out.println("Invalid!!");
        }

    }
}