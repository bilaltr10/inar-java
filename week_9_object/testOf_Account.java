package week_9_object;

public class testOf_Account {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("        Account Statement:");
        System.out.println("------------------------------");
        System.out.println("Account ID : "+ account.id);
        System.out.println("Date created : " + account.getDateCreated().toString());
        System.out.println("Balance : $" +account.getBalance());
        System.out.printf("Monthly Interest : $%.2f",account.getMonthlyInterest());

    }

}
