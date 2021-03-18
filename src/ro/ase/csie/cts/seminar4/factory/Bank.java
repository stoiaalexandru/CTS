package ro.ase.csie.cts.seminar4.factory;

import ro.ase.csie.cts.seminar4.banking.*;

public class Bank {

    private static Bank INSTANCE;
    private NotificationService emailNotificationService;
    private NotificationService smsNotificationService;

    private Bank(){
        emailNotificationService = new EmailNotificationService();
        smsNotificationService= new SMSNotificationService();
    }

    public static synchronized Bank getINSTANCE() {
        if(INSTANCE == null){
            INSTANCE = new Bank();
        }
        return INSTANCE;
    }

    public DebitBankAccount openDebitAccount(Person holder){

        Person.NotificationType preferenceType=holder.getNotificationType();
        NotificationService preferenceService;

        if(preferenceType.equals(Person.NotificationType.EMAIL)){
            preferenceService=emailNotificationService;
        }
        else{
            preferenceService=smsNotificationService;
        }
        if(holder.getAge() <= 18) {
            return new DebitBankAccount(generateIban(), holder, preferenceService);
        }
        return new FeeDebitBankAccount(generateIban(), holder, preferenceService);
    }

    private String generateIban(){
        return "INGB" + System.currentTimeMillis();
    }
}
