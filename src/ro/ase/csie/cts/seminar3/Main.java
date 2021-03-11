package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Account> employees = new HashMap<>();
        Person p1=new Person("Chuck Norris");
        Account b1 = new BankAccount("RFZ123123123", p1);

        Person p2= new Person("Arnold");
        Account b2=new FeeBankAccount("ING345345345",p2);

        Person p3= new Person("Arnold");
        Account b3=new BankAccount("ING345345345",p2);

        employees.put(p1,b1);
        employees.put(p2,b2);
        employees.put(p3,b3);

        for(Account a: employees.values()){
            a.deposit(1000);
        }
        for(Account a: employees.values()){

            try {
                a.withdraw(1000);
            } catch (InsuficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }




    }
}
