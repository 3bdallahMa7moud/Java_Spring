import model.EWalletSystem;
import service.AccountService;
import service.ApplicationService;
import service.impl.AccountServiceImpl;
import service.impl.EWalletApplicationServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EWalletSystem walletSystem = new EWalletSystem();
        AccountService accountService = new AccountServiceImpl(walletSystem);

        try (Scanner scanner = new Scanner(System.in)) {
            ApplicationService applicationService =
                    new EWalletApplicationServiceImpl(accountService, scanner);
            applicationService.start();
        }
    }
}
