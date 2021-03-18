package ro.ase.csie.cts.seminar4;




import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar4.banking.*;

public class Main {
    public static void main(String[] args) {

        NotificationService emailService=new EmailNotificationService();

        Person p3 = new Person("Van Damme");
        p3.setEmail("vann@damme.cocs");
        p3.setMobile("0732993322");
        DebitBankAccount b3  = new DebitBankAccount("BT123123123",p3,emailService);

        CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance( emailService,"INGB24342434",p3,100);
        CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount( emailService,"RFZ23154123",p3);

        b.deposit(50);
    }
}
