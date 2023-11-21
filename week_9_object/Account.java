package week_9_object;

import java.util.Date;

public class Account {
    int id;
    private double balance;
    private double annualInterestRate;

    private final Date dateCreated = new Date();

    public Account() {
        this(0,0,0);
    }

    //A constructor that creates an account with the specified id and initial balance.
    Account(int newId, double newBalance,double newInterestRate) {
        id = newId;
        balance = newBalance;
        annualInterestRate = newInterestRate;
    }
    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;

    }
    //The accessor and mutator methods for id, balance, and annualInterestRate.

    public int getId() {
        return id;
    }

    // Mutator (setter) method for id
    public void setId(int newId) {
        id = newId;
    }

    // Accessor (getter) method for balance
    public double getBalance() {
        return balance;
    }

    // Mutator (setter) method for balance
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    // Accessor (getter) method for annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Mutator (setter) method for annualInterestRate
    public void setAnnualInterestRate(double newRate) {
        annualInterestRate = newRate;

    }
    public Date getDateCreated() {
        return dateCreated;
    }
    double getMonthlyInterestRate(){
        return annualInterestRate/1200;
    }

    double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }

    public double withdraw(double amountOfWithdraw){
        balance-=amountOfWithdraw;
        return balance;
    }
  public  double deposit (double deposit){
        balance += deposit;
        return balance;
    }









}
