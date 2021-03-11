package ro.ase.csie.cts.seminar3;

public class CreditBankAccount implements Recievable{

    private long balance;

    private String iban;

    private Person accountHolder;

    public CreditBankAccount(String iban, Person accountHolder) {
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance=0;

    }

    public CreditBankAccount(long balance, String iban, Person accountHolder) {
        this.balance = balance;
        this.iban = iban;
        this.accountHolder = accountHolder;
    }


    @Override
    public void deposit(long amount) {
        this.balance += amount;
        System.out.println("Adding " + amount + "to " + iban);
    }
}
