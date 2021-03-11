package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends ReceivableBankAccount{



    public CreditBankAccount(String iban, Person accountHolder) {
        super(iban,accountHolder);

    }

    public CreditBankAccount(long balance, String iban, Person accountHolder) {
        super(iban,accountHolder,balance);

    }


    @Override
    public void deposit(long amount) {
        this.balance += amount;
        System.out.println("Adding " + amount + "to " + iban);
    }
}
