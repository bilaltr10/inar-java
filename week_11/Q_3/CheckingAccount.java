package week_11.Q_1.Q_3;

import week_9_object.Account;

public class CheckingAccount extends Account {

    private double overDraftLimit;

    CheckingAccount (int id ,double balance, double overDraftLimit){
        this.setId(id);
        this.setBalance(balance);
        this.overDraftLimit = overDraftLimit;
    }
}
