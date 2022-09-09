package account;

public class Account {

    private String generateCardId;
    private String userName;
    private String passWord;
    private double balance;
    private double withDrawLimit;


    public Account(String generateCardId, String userName, String passWord, double withDrawLimit) {
        this.generateCardId = generateCardId;
        this.userName = userName;
        this.passWord = passWord;
        this.withDrawLimit = withDrawLimit;
    }

    public String getGenerateCardId() {
        return generateCardId;
    }

    public void setGenerateCardId(String generateCardId) {
        this.generateCardId = generateCardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
}
