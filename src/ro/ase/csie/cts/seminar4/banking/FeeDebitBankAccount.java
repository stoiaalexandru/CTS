package ro.ase.csie.cts.seminar4.banking;

public class FeeDebitBankAccount extends DebitBankAccount {

    private long fee=2;

    public FeeDebitBankAccount(String iban, Person accountHolder, NotificationService notificationService) {
        super(iban, accountHolder,notificationService);
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        notificationService.sendNotification(accountHolder,"Adding "+fee+" fee to withdrawal!");
        super.withdraw(amount+fee);
    }
}
