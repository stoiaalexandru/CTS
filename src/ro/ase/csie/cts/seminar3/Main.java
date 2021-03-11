package ro.ase.csie.cts.seminar3;

import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Recievable> employees = new HashMap<>();

        NotificationService smsService=new SMSNotificationService();
        NotificationService emailService=new EmailNotificationService();

        Person p1 = new Person("Chuck Norris");
        p1.setEmail("chuck@norris.com");
        p1.setMobile("0742993322");
        CreditBankAccount b1 = new CreditBankAccount("RFZ123123132",p1,-1000,emailService);

        Person p2 = new Person("Arnold");
        p2.setEmail("ar@nold.com");
        p2.setMobile("0722993322");
        FeeDebitBankAccount b2 = new FeeDebitBankAccount("INGB12312313",p2,smsService);

        Person p3 = new Person("Van Damme");
        p3.setEmail("vann@damme.cocs");
        p3.setMobile("0732993322");
        DebitBankAccount b3  = new DebitBankAccount("BT123123123",p3,emailService);

        employees.put(p1,b1);
        employees.put(p2,b2);
        employees.put(p3,b3);

        for(Recievable a: employees.values()){
            a.deposit(1000);
        }

        Map<Person, Payable> union = new HashMap<>();

        union.put(p2,b2);
        union.put(p3,b3);

        for(Payable a: union.values()){
            try {
                a.withdraw(10);
            } catch (InsuficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n\n");

        try {
            b2.transfer(b3,300);
        } catch (InsuficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }


    }

