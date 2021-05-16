package za.ac.cput.accountCollection;

public class NumberMap {

    private long accountNumber;

    public NumberMap(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "NumberMap{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
