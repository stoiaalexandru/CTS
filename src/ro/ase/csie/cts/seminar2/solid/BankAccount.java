package ro.ase.csie.cts.seminar2.solid;

public class BankAccount {

    private String iban;
    private long balance;

    private Person accountHolder;

    public BankAccount(String iban, Person accountHolder) {
        this.iban = iban;
        this.balance = 0;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String iban, long balance, Person accountHolder) {
        this.iban = iban;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getIban() {
        return iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void withdraw(long amount) throws InsuficientFundsException {
        if(amount>this.balance)
        {
            throw new InsuficientFundsException("Not enough funds");
        }
        System.out.println("Withdrawing "+amount +" from "+ this.iban);
        this.balance-=amount;
    }
    public void deposit(long amount){
        System.out.println("Deposit "+amount +" to "+ this.iban);
        balance+=amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                ", accountHolder=" + accountHolder +
                '}';
    }
}
