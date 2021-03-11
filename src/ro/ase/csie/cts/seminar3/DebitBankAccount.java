package ro.ase.csie.cts.seminar3;

public class DebitBankAccount extends ReceivableBankAccount  implements Payable, Transferable{

    public DebitBankAccount(String iban, Person accountHolder) {
        super(iban,accountHolder);
    }

    public DebitBankAccount(String iban, long balance, Person accountHolder) {
        super(iban,accountHolder,balance);
    }

    @Override
    public void withdraw(long amount) throws InsuficientFundsException {
        if(amount>this.balance)
        {
            throw new InsuficientFundsException("Not enough funds");
        }
        System.out.println("Withdrawing "+amount +" from "+ this.iban);
        this.balance-=amount;
    }
    @Override
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

    @Override
    public void transfer(Recievable destination, long amount) throws InsuficientFundsException {
        this.withdraw(amount);
        destination.deposit(amount);
    }
}
