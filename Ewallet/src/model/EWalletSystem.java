package model;

import java.util.HashMap;
import java.util.Map;

public class EWalletSystem {
    private final Map<String, Account> accounts = new HashMap<>();

    public Map<String, Account> getAccounts() {
        return accounts;
    }
}
