package ro.ase.csie.cts.seminar3;

public abstract class ReceivableBankAccount implements Recievable{
    protected long balance;

    protected String iban;

    protected Person accountHolder;

    public ReceivableBankAccount( String iban, Person accountHolder,long balance) {

        this.iban = iban;
        this.accountHolder = accountHolder;
    }

    public ReceivableBankAccount(String iban, Person accountHolder) {
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

}
