package ro.ase.csie.cts.seminar3;

import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Person, Recievable> employees = new HashMap<>();

        Person p1 = new Person("Chuck Norris");
        CreditBankAccount b1 = new CreditBankAccount(-1000,"RFZ123123132", p1);

        Person p2 = new Person("Arnold");
        FeeDebitBankAccount b2 = new FeeDebitBankAccount("INGB12312313",p2);

        Person p3 = new Person("Van Damme");
        DebitBankAccount b3  = new DebitBankAccount("BT123123123",p3);

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
                e.getMessage();
            }
        }
    }


    }

