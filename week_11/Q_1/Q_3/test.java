package week_11.Q_1.Q_3;

public class test {
    public static void main(String[] args) {
        CheckingAccount test = new CheckingAccount(11,1450,500);
        System.out.println("ID : "+test.getId()+ "\nBalance is $"+ test.getBalance()+"\nLimit $-"+test.getBalance() );
        System.out.println("----------------------------------------------");
        SavingsAccount test2 = new SavingsAccount(16,4820);
        System.out.println("ID : "+test2.getId()+ "\nBalance is $"+ test2.getBalance());

    }
}
