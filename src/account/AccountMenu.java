package account;

import java.util.Scanner;

public class AccountMenu {


    public static void depositMoney(Account account, Scanner scanner){
        System.out.println("==================Saving operation======================");
        System.out.println("Please enter the deposit amount: ");
        double money=scanner.nextDouble();

        account.setBalance(account.getBalance()+money);
        System.out.println("Deposit completed!");
        showAccount(account);
    }

    public static void showAccount(Account account) {
        System.out.println("==================Current account details======================");
        System.out.println("Card No.:"+account.getGenerateCardId());
        System.out.println("full name: "+account.getUserName().toUpperCase());
        System.out.println("Balance: "+account.getBalance());
        System.out.println("Current cash withdrawal limit: "+account.getWithDrawLimit());

    }

}
