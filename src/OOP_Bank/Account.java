package OOP_Bank;


import java.util.Objects;

public class Account {
   private   String secondName;
    private   String firstName;
    private double balance;
  private   String accountNumber;
    Bank bank;

    private String pin;


    public Account(String firstName, String secondName, String pin) {
        if (firstName == null){
            throw new NullPointerException("First name can not be empty");
        }
            this.firstName = firstName;

        if (secondName == null){
            throw new NullPointerException("Second name can not be empty");
        }
            this.secondName = secondName;

        if (pin == null) {
            throw new NullPointerException("Second name can not be empty");
        }
        this.pin = pin;
    }

    public boolean validatePinLength(String pin) {
       boolean length = false;
       try {
           length = (pin.length() == 4);
       }catch (Exception e){
           System.out.println("Pin can not empty");
       }
       if (Objects.equals(length ,true)){
          return true;
       }
        return false;
    }


    public String  validatePin(String pin) {
        if (Objects.equals(validatePinLength(pin) , true)){
            if (pin.equals(this.pin)){
                this.pin = pin;
                return  pin;
            }
        }
        throw new IllegalArgumentException("Incorrect Pin");
    }
        public void setAccountNumber(String accountNumbers) {
        accountNumber = accountNumbers;
    }

    public String getAccountNumber() {
        System.out.println(accountNumber);
        return accountNumber;
    }

    public void deposit(int depositAmount) {

            if (depositAmount > 0 ) {
                balance = balance + depositAmount;
            } else
                throw new IllegalArgumentException("invalid Amount");


    }

    public void withdrawCash(int amount, String pin) {
        try {
            if (Objects.equals(validatePin(pin), pin)) {
                if (amount <= balance && amount > 0) {
                    balance = balance - amount;
                } else throw new IllegalArgumentException("Invalid amount");
            }
        }catch (Exception e) {
            System.out.println("Incorrect Pin");
            }
    }


    public double getBalance(String pin) {
        try {
            if (Objects.equals(validatePin(pin), pin)) {
                return balance;
            }
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Incorrect Password");
        }
        return Double.parseDouble(null);
    }
    public String getAcountNumber(){

            return  accountNumber ;
        }
    }




