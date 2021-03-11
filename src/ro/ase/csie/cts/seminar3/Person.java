package ro.ase.csie.cts.seminar3;

import java.util.Date;

public class Person {

    private String name;
    private String address;
    private Date birthday;
    private long salary;

    public Person(String name, String address, Date birthday, long salary) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.salary = salary;
    }
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
