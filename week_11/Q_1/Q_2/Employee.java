package week_11.Q_1.Q_2;

import week_10.Q_14.MyDate;

import java.util.Date;

public class Employee extends Person {
    String office;
    double salary;

    Employee() {

    }

    Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.office = office;
        this.salary = salary;

    }

    public String toString() {

        return "_Employee_" +
                "\nName : " + name +
                "\nAdress : " + address +
                "\nPhone number : " + phoneNumber +
                "\nE-mail : " + email +
                "\nOffice :" + office +
                "\nSalary : " + salary +
                "\nHiredDate : " + new MyDate();

    }
    }

