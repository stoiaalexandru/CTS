package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
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

        System.out.println(account);
    }
}
