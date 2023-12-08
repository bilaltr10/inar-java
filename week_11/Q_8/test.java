package week_11.Q_1.Q_8;

public class test {
    public static void main(String[] args) {

      //      TransAction test = new TransAction('d',30,1000,"Deposit To Bank");
        TransAction test1 = new TransAction('d',30,1000,"Deposit To Bank");
//        TransAction test3 = new TransAction('d',30,1000,"Deposit To Bank");
//        TransAction test5 = new TransAction('d',30,1000,"Deposit To Bank");
//        TransAction test6 = new TransAction('d',30,1000,"Deposit To Bank");


        NewAccount newAccount = new NewAccount("Bilal",1207,0);
        newAccount.addTransaction(test1);
        newAccount.addTransaction(test1);
        newAccount.addTransaction(test1);
        newAccount.addTransaction(test1);

        newAccount.toString();

    }
}
