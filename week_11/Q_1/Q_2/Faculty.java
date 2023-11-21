package week_11.Q_1.Q_2;

import week_10.Q_14.MyDate;

import java.util.Date;

public class Faculty extends Employee {

    String officeHours;
    String rank;


    Faculty() {

    }

    Faculty(String name, String address, String phoneNumber, String email, String office,double salary, String officeHours, String rank) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.officeHours = officeHours;
        this.rank = rank;
        this.salary = salary;
        this.office = office;
    }

    public String toString() {
        return "     _Faculty_" +
                "\nName : " + name +
                "\nAdress : " + address +
                "\nPhone number : " + phoneNumber +
                "\nE-mail : " + email +
                "\nOffice : " + office +
                "\nSalary : " + salary +

                "\nOffice Hours : " + officeHours +
                "\nRank : " + rank +
                "\nHired Date : " + new MyDate() ;

    }

}
