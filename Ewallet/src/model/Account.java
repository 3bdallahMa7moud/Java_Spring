package model;

public class Account {
    private final String phoneNumber;
    private final String ownerName;
    private double balance;

    public Account(String phoneNumber, String ownerName) {
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
