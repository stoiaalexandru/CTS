package ro.ase.csie.cts.seminar4;




import ro.ase.csie.cts.seminar4.banking.*;
import ro.ase.csie.cts.seminar4.factory.Bank;
import ro.ase.csie.cts.seminar4.singleton.Elvis;
import ro.ase.csie.cts.seminar4.singleton.ElvisV2;

public class Main {
    public static void main(String[] args) {

        NotificationService emailService=new EmailNotificationService();

        Person p3 = new Person("Van Damme",19);
        p3.setEmail("vann@damme.cocs");
        p3.setMobile("0732993322");
        p3.setNotificationType(Person.NotificationType.SMS);

        Person p4 = new Person("Van Damme",17);
        p4.setEmail("Jackie@x.cocs");
        p4.setMobile("07999999999");
        p4.setNotificationType(Person.NotificationType.EMAIL);

//        DebitBankAccount b3  = new DebitBankAccount("BT123123123",p3,emailService);
//
//        CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance( emailService,"INGB24342434",p3,100);
//        CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount( emailService,"RFZ23154123",p3);
//
//        b.deposit(50);
//
//        Elvis.getInstance().sing();
//        ElvisV2 elvisV2=ElvisV2.INSTANCE;
//        elvisV2.sing();

        Bank bank = Bank.getINSTANCE();
        DebitBankAccount debit1 = bank.openDebitAccount(p3);
        DebitBankAccount debit2 = bank.openDebitAccount(p4);

        debit1.deposit(500);
        debit2.deposit(500);
        try {
            debit1.withdraw(450);
            debit2.withdraw(450);
        } catch (InsuficientFundsException e) {
            e.printStackTrace();
        }
        // debit1.withdraw(300);
    }
}
