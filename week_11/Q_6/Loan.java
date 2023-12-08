package week_11.Q_1.Q_6;

import week_9_object.Location;

import java.util.Date;

public class Loan {
    double annualInterestDate;
    int numberOfYears;
    double loanAmount;

    Loan() {

        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestDate, int numberOfYears, double loanAmount) {
        this.annualInterestDate = annualInterestDate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public String toString()
    {
        return "Annual Interest Rate :" + annualInterestDate +
                "\nNumber of Years : " + numberOfYears +
                "\nLoan Amount : " + loanAmount+
                "\nLoan Date : "+ new Date();
    }
}
