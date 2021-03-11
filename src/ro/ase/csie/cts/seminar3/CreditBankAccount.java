package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends ReceivableBankAccount{



    public CreditBankAccount( String iban, Person accountHolder,long balance,NotificationService notificationService) {
        this.notificationService=notificationService;

        this.iban = iban;
        this.accountHolder = accountHolder;
    }

    public CreditBankAccount(String iban, Person accountHolder,NotificationService notificationService) {
        this.notificationService=notificationService;
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }


    @Override
    public void deposit(long amount) {
        notificationService.sendNotification(accountHolder,"Adding " + amount + "to " + iban);
        this.balance += amount;


    }
}
