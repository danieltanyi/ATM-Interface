package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getCardId() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        assertEquals("2022500",account.getGenerateCardId());
    }

    @Test
    void setCardId() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        account.setGenerateCardId("6563456");
        assertEquals("6563456",account.getGenerateCardId());
    }

    @Test
    void getUserName() {
        Account account = new Account("5098765","John","0000",800.0);
        assertEquals("John",account.getUserName());

    }

    @Test
    void setUserName() {
        Account account = new Account("6786590","Daniel","1111",600.0);
        account.setUserName("Paul");
        assertEquals("Paul",account.getUserName());
    }

    @Test
    void getPassWord() {
        Account account = new Account("8986433","Daniel","1111",400.0);
        assertEquals("1111",account.getPassWord());
    }

    @Test
    void setPassWord() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        account.setPassWord("12bc");
        assertEquals("12bc",account.getPassWord());
    }

    @Test
    void getBalance() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        assertEquals(0,account.getBalance());
    }

    @Test
    void setBalance() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        account.setBalance(3000);
        assertEquals(3000,account.getBalance());
    }

    @Test
    void getWithDrawLimit() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        assertEquals(400.0,account.getWithDrawLimit());
    }

    @Test
    void setWithDrawLimit() {
        Account account = new Account("2022500","Daniel","1111",400.0);
        account.setWithDrawLimit(6000);
        assertEquals(6000,account.getWithDrawLimit());
    }
}