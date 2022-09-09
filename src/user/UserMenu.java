package user;

import account.Account;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static account.AccountMenu.depositMoney;
import static account.AccountMenu.showAccount;
import static transaction.TransactionMenu.withDrawMoney;
import static transaction.TransferLogic.transferMoney;
import static user.UserLogic.updatePassWord;

public class UserMenu {

    public static void showUserCommand(Scanner scanner, Account account, ArrayList<Account> accounts) {
        while (true) {
            try {
                System.out.println("==================User interface======================");
                System.out.println("[1] show account transaction history");
                System.out.println("[2] deposit");
                System.out.println("[3] withdraw money");
                System.out.println("[4] transfer money");
                System.out.println("[5] Change Password");
                System.out.println("[6] Logout");

                System.out.println("Please choose an option and press enter:");
                int command = scanner.nextInt();
                switch (command) {
                    case 1:
                        showAccount(account);
                        break;
                    case 2:
                        depositMoney(account, scanner);
                        break;
                    case 3:
                        withDrawMoney(account, scanner);
                        break;
                    case 4:
                        transferMoney(account, accounts, scanner);
                        break;
                    case 5:
                        updatePassWord(account, scanner);
                        return;
                    case 6:
                        System.out.println("looking forward to your next visit!!");
                        return;
                    default:
                        System.out.println("Your command input is incorrect~~~~");
                }
            } catch (InputMismatchException e) {
                System.out.println("Your command input is incorrect~~~~");
                scanner.next();
            }
        }
    }
}

