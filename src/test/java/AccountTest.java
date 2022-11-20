import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    Account account;

    @Test
    public void checkNameToEmbossSendNameLengthLess3() {
        account = new Account("A ");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendNameLength3() {
        account = new Account("A B");
        assertTrue(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendNameLength4() {
        account = new Account("AB C");
        assertTrue(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendNameLength18() {
        account = new Account("Abcd qwertyuioplkj");
        assertTrue(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendNameLength19() {
        account = new Account("Abcd qasdfghjklmnbv");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendNameLength20() {
        account = new Account("Aqwerty tyuioplkjhgf ");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendNameLengthMore13() {
        account = new Account("Bob Rich00000000000000000");
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void checkNameToEmbossSendName() {
        account = new Account("A B C");
        assertFalse(account.checkNameToEmboss());
    }
}