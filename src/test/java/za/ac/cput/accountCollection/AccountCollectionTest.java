package za.ac.cput.accountCollection;
/**
 * This is a simple Bank Accounts program
 *
 * @ author Nonhlahla Hlungwani 218160658
 * 3 May 2021
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class AccountCollectionTest {
    @Test
    public void testAccountCollection(){
        Collection<AccountCollection> accountCollection = new ArrayList<>();
        for(int i = 0; i < 4; i++)
        {
            String aH = "N" + 1;
            AccountCollection bAcc = new AccountCollection(aH) {
                @Override
                public long getAccountNumber() {
                    return super.getAccountNumber();
                }

                @Override
                public String getAccountHolder() {
                    return super.getAccountHolder();
                }

                @Override
                public String getAccountType() {
                    return super.getAccountType();
                }

                @Override
                public String toString() {
                    return super.toString();
                }

                @Override
                public int hashCode() {
                    return super.hashCode();
                }

                @Override
                public boolean equals(Object obj) {
                    return super.equals(obj);
                }
            };
            accountCollection.add(bAcc);
        }
        assertEquals(4,accountCollection.size());
    }

}