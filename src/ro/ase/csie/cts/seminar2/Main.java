package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;
import ro.ase.csie.cts.seminar2.solid.InsuficientFundsException;
import ro.ase.csie.cts.seminar2.solid.Person;

public class Main {
    public static void main(String[] args) {

//        CalendarUtil cu = new CalendarUtil();
//        try {
//            System.out.println(cu.weekDay(1));
//            System.out.println(cu.weekDay2(3));
//            System.out.println(cu.weekDay3(3));
//            System.out.println(cu.weekDay4(2));
//        } catch (IncorrectDayException e) {
//            e.printStackTrace();
//        }
        Person person= new Person("Andrei");
        BankAccount account=new BankAccount("INGB33445532", person);
        account.deposit(100);
        try {
            account.withdraw(30);
            account.withdraw(70);
        } catch (InsuficientFundsException e) {
            System.out.println(e.getMessage());
        }


        System.out.println(account.getBalance());

        FeeBankAccount fb= new FeeBankAccount("INGB123012340",person);
        fb.deposit(200);
        try {
            fb.withdraw(20);
        } catch (InsuficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(fb.getBalance());

    }
}
