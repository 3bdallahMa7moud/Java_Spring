package service.impl;

import model.Account;
import service.AccountService;
import service.ApplicationService;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class EWalletApplicationServiceImpl implements ApplicationService {
    private static final int CREATE_ACCOUNT = 1;
    private static final int DEPOSIT = 2;
    private static final int WITHDRAW = 3;
    private static final int TRANSFER = 4;
    private static final int SHOW_BALANCE = 5;
    private static final int EXIT = 0;

    private final AccountService accountService;
    private final Scanner scanner;

    public EWalletApplicationServiceImpl(AccountService accountService, Scanner scanner) {
        this.accountService = accountService;
        this.scanner = scanner;
    }

    @Override
    public void start() {
        System.out.println("E-Wallet");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Choose: ");

            try {
                switch (choice) {
                    case CREATE_ACCOUNT:
                        createAccount();
                        break;
                    case DEPOSIT:
                        deposit();
                        break;
                    case WITHDRAW:
                        withdraw();
                        break;
                    case TRANSFER:
                        transfer();
                        break;
                    case SHOW_BALANCE:
                        showBalance();
                        break;
                    case EXIT:
                        running = false;
                        System.out.println("Done.");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (IllegalArgumentException | NoSuchElementException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private void printMenu() {
        System.out.println();
        System.out.println("1. New account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Balance");
        System.out.println("0. Exit");
    }

    private void createAccount() {
        String phoneNumber = readString("Phone (11 digits): ");
        String ownerName = readString("Name: ");

        accountService.createAccount(phoneNumber, ownerName);
        System.out.println("Account added");
    }

    private void deposit() {
        String phoneNumber = readString("Phone: ");
        double amount = readDouble("Amount: ");

        accountService.deposit(phoneNumber, amount);
        System.out.println("Deposit completed");
    }

    private void withdraw() {
        String phoneNumber = readString("Phone: ");
        double amount = readDouble("Amount: ");

        accountService.withdraw(phoneNumber, amount);
        System.out.println("Withdrawal completed");
    }

    private void transfer() {
        String fromPhoneNumber = readString("From phone: ");
        String toPhoneNumber = readString("To phone: ");
        double amount = readDouble("Amount: ");

        accountService.transfer(fromPhoneNumber, toPhoneNumber, amount);
        System.out.println("Transfer completed");
    }

    private void showBalance() {
        String phoneNumber = readString("Phone: ");
        Account account = accountService.getAccount(phoneNumber);

        System.out.printf("Name: %s%n", account.getOwnerName());
        System.out.printf("Balance: %.2f%n", account.getBalance());
    }

    private String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Enter a number");
            }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Enter a valid amount");
            }
        }
    }
}
