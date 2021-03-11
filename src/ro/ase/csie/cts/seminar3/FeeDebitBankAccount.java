package ro.ase.csie.cts.seminar3;

public class FeeDebitBankAccount extends DebitBankAccount {

    private long fee=2;

    public FeeDebitBankAccount(String iban, Person accountHolder) {
        super(iban, accountHolder);
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        System.out.println("Adding "+fee+" fee to withdrawal!");
        super.withdraw(amount+fee);
    }
}
