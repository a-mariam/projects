package OOP_Bank;

public class BankAccount {
    double balance;
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println(balance);
    }
    public void withdraw(String pin, int amount){
        if (pin.equals(pin)) balance = balance -amount;
        System.out.println(balance);
    }

}
