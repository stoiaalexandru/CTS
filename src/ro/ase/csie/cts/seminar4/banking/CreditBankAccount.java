package ro.ase.csie.cts.seminar4.banking;

public class CreditBankAccount extends ReceivableBankAccount {



    public CreditBankAccount(NotificationService notificationService, String iban, Person accountHolder, long balance) {
        this.notificationService=notificationService;
        this.balance=balance;
        this.iban = iban;
        this.accountHolder = accountHolder;
    }

    public static CreditBankAccount createCreditBankAccountWithBalance(NotificationService notificationService, String iban, Person accountHolder, long balance){
        return new CreditBankAccount(notificationService,iban,accountHolder,balance);
    }

    public static CreditBankAccount createCreditBankAccount(NotificationService notificationService, String iban, Person accountHolder){
        return new CreditBankAccount(notificationService,iban,accountHolder,0);
    }



    @Override
    public void deposit(long amount) {
        notificationService.sendNotification(accountHolder,"Adding " + amount + "to " + iban);
        this.balance += amount;


    }

    @Override
    public String toString() {
        return "CreditBankAccount{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
