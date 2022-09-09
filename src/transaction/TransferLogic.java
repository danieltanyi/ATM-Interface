package transaction;

import account.Account;

import java.util.ArrayList;
import java.util.Scanner;


import static account.AccountLogic.getAccountByCardId;
import static account.AccountMenu.showAccount;

public class TransferLogic {


    public static void transferMoney(Account acc, ArrayList<Account> accounts, Scanner scanner) {

        if(accounts.size()<2){
            System.out.println("Sorry, there are no other accounts in the system, you can't transfer!");
            System.out.println("Create a second account inorder to transfer funds!");
            return;
        }

        if(acc.getBalance()==0){
            System.out.println("Sorry, you don't have any money, so don't make it~~");
            return;
        }

        while (true) {
            System.out.println("Please enter the card number of the other party:");
            String cardId=scanner.next();
            Account account=getAccountByCardId(cardId,accounts);

            if(account!=null){

                if(account.getGenerateCardId()==acc.getGenerateCardId()){
                    System.out.println("You cannot transfer money for yourself!");
                }else{
                    String name="*"+account.getUserName().substring(1);
                    System.out.println("Please confirm["+name+"]Last name:");
                    String preName=scanner.next();
                    if(account.getUserName().startsWith(preName)){

                        System.out.println("Please enter the transfer amount:");
                        double money=scanner.nextDouble();
                        if(money>acc.getBalance()){
                            System.out.println("Sorry, you have too much money to transfer. You can transfer at most"+acc.getBalance());
                        }else{
                            acc.setBalance(acc.getBalance()-money);
                            account.setBalance(account.getBalance()+money);
                            System.out.println("Congratulations, the transfer has been successful and has been to "
                                    +account.getUserName().toUpperCase() +  "transfer accounts "+money);
                            showAccount(acc);
                            return;
                        }
                    }else {
                        System.out.println("Sorry, your authentication information is incorrect~~~");
                    }
                }
            }else{
                System.out.println("Sorry, there is a problem with the transfer card number you entered!");
            }
        }
    }


}
