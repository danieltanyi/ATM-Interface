package user;

import account.Account;

import java.util.ArrayList;
import java.util.Scanner;


import static account.AccountLogic.getAccountByCardId;

import static user.UserMenu.showUserCommand;

public class User  {


    public static void login(ArrayList<Account> accounts, Scanner scanner) {
        System.out.println("==================User login function======================");
        if(accounts.size()==0){
            System.out.println("There is no account in the current system. You need to signup first!");
            return;
        }
        while(true){
            System.out.println("Please enter your login card number:");
            String cardId=scanner.next();


            Account acc=getAccountByCardId(cardId,accounts);

            if(acc!=null){
                while (true){
                    System.out.println("Please enter your login password:");
                    String password=scanner.next();

                    if(acc.getPassWord().equals(password)){
                        System.out.println("Congratulations, "+acc.getUserName().toUpperCase() + " Sir/Ms. successfully entered the system,Your card number is: "+acc.getGenerateCardId());

                        showUserCommand(scanner,acc,accounts);
                        return;
                    }else {
                        System.out.println("Your password is incorrect, please confirm!");
                    }
                }
            }else{
                System.out.println("Sorry, there is no account with this card number!");
            }
        }
    }

}

