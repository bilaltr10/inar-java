package week_11.Q_1.Q_2;

import week_10.Q_14.MyDate;

import java.util.Date;

public class Staff extends Employee {
    String title;

    Staff() {

    }

    Staff(String name, String address, String phoneNumber, String email, String office, double salary, String title) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.title = title;
        this.salary = salary;
        this.office = office;
    }

    public String toString() {
        return "     _Staff_" +
                "\nName : " + name +
                "\nAdress : " + address +
                "\nPhone number : " + phoneNumber +
                "\nE-mail : " + email +
                "\nOffice : " + office +
                "\nSalary : " + salary +
                "\nHired Date : " + new MyDate() +
                "\nTitle : " + title;


    }

}
