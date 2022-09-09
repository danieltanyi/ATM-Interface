package transaction;

import account.Account;

import java.util.Scanner;

public class TransactionMenu {

    public static void withDrawMoney(Account account, Scanner scanner) {
        System.out.println("==================Withdrawal operation======================");

        if (account.getBalance() >= 100) {
            while (true) {
                System.out.println("Please enter the withdrawal amount:");
                double money = scanner.nextDouble();

                if (money > account.getWithDrawLimit()) {
                    System.out.println("If the withdrawal amount exceeds the limit of each time, you should not withdraw so much. You can withdraw at most:" + account.getWithDrawLimit());
                } else {
                    if (account.getBalance() >= money) {
                        account.setBalance(account.getBalance() - money);
                        System.out.println("Congratulations, withdraw the money " + money + "succeed! Current account remaining: " + account.getBalance());
                        return;
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                }
            }
        } else {
            System.out.println("Don't withdraw if your balance doesn't exceed 100 Kronor~~~");
        }
    }

    }
