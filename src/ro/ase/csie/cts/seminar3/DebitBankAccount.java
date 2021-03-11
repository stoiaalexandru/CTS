package ro.ase.csie.cts.seminar3;

public class DebitBankAccount extends ReceivableBankAccount  implements Payable, Transferable{

    public DebitBankAccount( String iban, Person accountHolder,long balance,NotificationService notificationService) {
        this.notificationService=notificationService;
        this.iban = iban;
        this.accountHolder = accountHolder;
    }

    public DebitBankAccount(String iban, Person accountHolder,NotificationService notificationService) {
        this.notificationService=notificationService;
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        if(amount>this.balance)
        {
            throw new InsuficientFundsException("Not enough funds");
        }
        notificationService.sendNotification(accountHolder,("Withdrawing "+amount +" from "+ this.iban));
        this.balance-=amount;
    }
    @Override
    public void deposit(long amount){
        notificationService.sendNotification(accountHolder,"Deposit "+amount +" to "+ this.iban);
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

    @Override
    public void transfer(Recievable destination, long amount) throws InsuficientFundsException {
        this.withdraw(amount);
        destination.deposit(amount);
    }
}
