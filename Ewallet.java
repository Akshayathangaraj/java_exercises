import java.util.ArrayList;
import java.util.Date;

public class Ewallet {
    private double balance;
    private ArrayList<String> transactionList;

    public EWallet() {
        this.balance = 0.0;
        this.transactionList = new ArrayList<>();
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionList.add(new Date() + " - Added: " + amount);
            System.out.println( amount + " added successfully.");
        } else {
            System.out.println("Invalid amount. Must be positive.");
        }
    }
    public void pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionList.add(new Date() + " - Paid: " + amount);
            System.out.println(amount + " paid successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void viewMiniStatement() {
        System.out.println("---- Mini Statement ----");
        for (String txn : transactionList) {
            System.out.println(txn);
        }
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------");
    }
    public double getBalance() {
        return balance;
    }
}
