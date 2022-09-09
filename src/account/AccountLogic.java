package account;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountLogic {


    public static void signUp(ArrayList<Account> accounts, Scanner scanner) {
        System.out.println("==================User account opening function======================");
        System.out.println("Please enter your account Last name: ");
        String name=scanner.next();



        String passWord="";
        while (true){
            System.out.println("Please enter your account opening password:");
            passWord=scanner.next();
            System.out.println("Please enter your confirmation password:");
            String okPassword=scanner.next();

            if(okPassword.equals(passWord)){
                break;
            }else{
                System.out.println("The two passwords must be the same~~~~~");
            }
        }
        System.out.println("Please enter the current withdrawal limit:");
        double quotaMoney=scanner.nextDouble();

        String cardId=createCardId(accounts);

        Account account=new Account(cardId,name,passWord,quotaMoney);
        accounts.add(account);
        System.out.println("Congratulations. Your card number is: "+account.getGenerateCardId()+ ",Please keep it safe as you will use it to login");

    }

    public static String createCardId(ArrayList<Account> accounts){
        while (true) {
            String cardId="";
            Random r=new Random();
            for (int i = 0; i < 8; i++) {
                cardId+=r.nextInt(10);
            }
            Account acc=getAccountByCardId(cardId,accounts);
            if(acc==null){
                return cardId;
            }
        }
    }

   public static Account getAccountByCardId(String cardId, ArrayList<Account> accounts) {

        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            if(acc.getGenerateCardId().equals(cardId)){
                return acc;
            }
        }
        return null;

    }

}
