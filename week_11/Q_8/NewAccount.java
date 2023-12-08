package week_11.Q_1.Q_8;

import week_9_object.Account;

import java.util.ArrayList;
import java.util.Date;

public class NewAccount extends Account {

    String nameOfCustomer;
    ArrayList<TransAction> transActions;

    NewAccount() {
        transActions = new ArrayList<>();
    }

    NewAccount(String nameOfCustomer, int ID, double balance) {
        this.nameOfCustomer = nameOfCustomer;
        this.setId(ID);
        this.setBalance(balance);
    }

    public void addTransaction(TransAction newTransaction) {
        transActions.add(newTransaction);
    }

public String toString(){
        return "Name : " + getBalance();





}

    }



