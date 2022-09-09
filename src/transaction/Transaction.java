package transaction;

import account.Account;

import java.util.ArrayList;

import java.util.Scanner;

import static account.AccountLogic.signUp;
import static user.User.login;

public class Transaction {

    public static void showMain(ArrayList<Account> accounts) {
        System.out.println("==================Welcome to the home page======================");
        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.println("[1] Login");
                System.out.println("[2] SignUp");
                System.out.print("Choose an option and press enter:");
                int command = 0;
                try {
                    command = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("No space btw letters is allowed:");
                    throw new RuntimeException(e);
                }

                switch (command) {

                    case 1:
                        login(accounts, scanner);
                        break;
                    case 2:
                        signUp(accounts, scanner);
                        break;
                    default:
                        System.out.println("The operation command you currently entered is not supported!");
                }
            }

        }

    }
