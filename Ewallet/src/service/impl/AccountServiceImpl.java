package service.impl;

import model.Account;
import model.EWalletSystem;
import service.AccountService;

import java.util.Map;
import java.util.NoSuchElementException;

public class AccountServiceImpl implements AccountService {
    private static final String PHONE_PATTERN = "\\d{11}";

    private final EWalletSystem walletSystem;

    public AccountServiceImpl(EWalletSystem walletSystem) {
        this.walletSystem = walletSystem;
    }

    @Override
    public void createAccount(String phoneNumber, String ownerName) {
        validatePhone(phoneNumber);
        validateOwnerName(ownerName);

        Map<String, Account> accounts = walletSystem.getAccounts();
        if (accounts.containsKey(phoneNumber)) {
            throw new IllegalArgumentException("This phone already has an account");
        }

        accounts.put(phoneNumber, new Account(phoneNumber, ownerName.trim()));
    }

    @Override
    public void deposit(String phoneNumber, double amount) {
        validateAmount(amount);
        Account account = getAccountOrThrow(phoneNumber);
        account.deposit(amount);
    }

    @Override
    public void withdraw(String phoneNumber, double amount) {
        validateAmount(amount);
        Account account = getAccountOrThrow(phoneNumber);

        if (account.getBalance() < amount) {
            throw new IllegalArgumentException("Not enough balance");
        }

        account.withdraw(amount);
    }

    @Override
    public void transfer(String fromPhoneNumber, String toPhoneNumber, double amount) {
        validateAmount(amount);
        validatePhone(fromPhoneNumber);
        validatePhone(toPhoneNumber);

        if (fromPhoneNumber.equals(toPhoneNumber)) {
            throw new IllegalArgumentException("Use two different accounts");
        }

        Account fromAccount = getAccountOrThrow(fromPhoneNumber);
        Account toAccount = getAccountOrThrow(toPhoneNumber);

        if (fromAccount.getBalance() < amount) {
            throw new IllegalArgumentException("Not enough balance");
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    @Override
    public Account getAccount(String phoneNumber) {
        return getAccountOrThrow(phoneNumber);
    }

    private void validatePhone(String phoneNumber) {
        if (isBlank(phoneNumber)) {
            throw new IllegalArgumentException("Phone is required");
        }

        if (!phoneNumber.matches(PHONE_PATTERN)) {
            throw new IllegalArgumentException("Phone must be 11 digits");
        }
    }

    private void validateOwnerName(String ownerName) {
        if (isBlank(ownerName)) {
            throw new IllegalArgumentException("Name is required");
        }
    }

    private void validateAmount(double amount) {
        if (Double.isNaN(amount) || Double.isInfinite(amount) || amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    private Account getAccountOrThrow(String phoneNumber) {
        validatePhone(phoneNumber);

        Account account = walletSystem.getAccounts().get(phoneNumber);
        if (account == null) {
            throw new NoSuchElementException("Account not found");
        }

        return account;
    }

    private boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }
}
