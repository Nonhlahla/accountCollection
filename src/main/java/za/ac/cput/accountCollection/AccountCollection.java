package za.ac.cput.accountCollection;
/**
 * This is a simple Bank Accounts program
 *
 * @ author Nonhlahla Hlungwani 218160658
 * 3 May 2021
 */

public abstract class AccountCollection  {
    private long accountNumber;
    private String accountHolder;
    private String accountType;

    public AccountCollection(String aH) {
    }

    public AccountCollection() {

    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
