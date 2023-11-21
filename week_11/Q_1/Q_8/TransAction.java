package week_11.Q_1.Q_8;

import java.util.Date;

public class TransAction extends NewAccount {

    private Date date;
    private char ch;
    private Double amount;
    private double balance;
    private String description;

    TransAction(char ch, double amount, double balance, String description) {
        setCh(ch);
        setAmount(amount);
        setBalance(balance);
        setDescription(description);


    }

    public Date getDate() {
        return date;
    }

    public char getCh() {
        return ch;
    }

    public Double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void setAmount(Double amount) {
        this.amount = amount;

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public String toString() {
//        return "Date : " + new Date() +
//                "TransAction type : " + (getCh() == 'd' ? "Deposit" : "Withdrawal") +
//                "Amount : " + getAmount() +
//                "Balance : " + getBalance() +
//                "Description : " + getDescription();
//
//    }

}
