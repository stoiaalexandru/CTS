package ro.ase.csie.cts.seminar4.banking;

public class CreditBankAccount extends ReceivableBankAccount {



    public CreditBankAccount(String iban, Person accountHolder, long balance, NotificationService notificationService) {
        this.notificationService=notificationService;
        this.balance=balance;
        this.iban = iban;
        this.accountHolder = accountHolder;
    }

    public CreditBankAccount(String iban, Person accountHolder, NotificationService notificationService) {
        this.notificationService=notificationService;
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public static CreditBankAccount createCreditBankAccount(NotificationService notificationService, String iban, Person accountHolder, long balance){
        return new CreditBankAccount(iban,accountHolder,balance,notificationService);
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
