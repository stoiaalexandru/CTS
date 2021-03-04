package ro.ase.csie.cts.seminar2.solid;

public class FeeBankAccount extends BankAccount {

    private long fee=2;

    public FeeBankAccount(String iban, Person accountHolder) {
        super(iban, accountHolder);
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        System.out.println("Adding "+fee+" fee to withdrawal!");
        super.withdraw(amount+fee);
    }
}
