package user;

import account.Account;

import java.util.Scanner;

public class UserLogic {


    public static void updatePassWord(Account account, Scanner scanner) {
        System.out.println("==================Change Password======================");
        while (true) {
            System.out.println("Please enter the correct password:");
            String okPassWord=scanner.next();
            //Determine whether the password is correct
            if(account.getPassWord().equals(okPassWord)){
                while (true) {
                    System.out.println("Please enter a new password:");
                    String newPassWord=scanner.next();

                    System.out.println("Please enter your confirmation password:");
                    String okNewPassWord=scanner.next();

                    if(newPassWord.equals(okNewPassWord)){
                        account.setPassWord(newPassWord);
                        return;
                    }else{
                        System.out.println("The passwords you entered twice are inconsistent~~");
                    }
                }
            }else{
                System.out.println("The password currently entered is incorrect~~~");
            }
        }

    }
}
