package service;

import model.Account;

public interface AccountService {
    void createAccount(String phoneNumber, String ownerName);

    void deposit(String phoneNumber, double amount);

    void withdraw(String phoneNumber, double amount);

    void transfer(String fromPhoneNumber, String toPhoneNumber, double amount);

    Account getAccount(String phoneNumber);
}
