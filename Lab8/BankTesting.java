package Lab8;

import Lab6_1.Account;
import Lab6_1.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTesting {

    @Test
    public void getFirstAccountShouldReturnFirstAccount(){
        Bank test = new Bank();
        Account account = new Account("FirstAccount","100296");

        test.addAccount(account);

        assertEquals("FirstAccount",test.getAccount("FirstAccount","100296").getName(),"Get FirstAccount name should return FirstAccount");
        assertEquals("100296",test.getAccount("FirstAccount","100296").getDateOfBirth(),"Get FirstAccount date of birth should return 100296");
    }

    @Test
    public void getNoNameAccountShouldReturnNoName(){
        Bank test = new Bank();
        Account account = new Account("","999999");

        test.addAccount(account);

        assertEquals("",test.getAccount("","999999").getName(),"Get no name account should return no name");
        assertEquals("999999",test.getAccount("","999999").getDateOfBirth(), "999999 should be the date of birth");
    }

    @Test
    public void getUnexistingAccountShouldReturnNull(){
        Bank test = new Bank();
        assertEquals(null,test.getAccount("hello","123456"),"Unexisting account should return null");
    }

}
