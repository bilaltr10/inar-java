package week_10.Q_7;

import week_9_object.Account;

import java.util.Scanner;

public class ATM_Machine {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        Account[] account = new Account[10];

        for (int i = 0; i < account.length; i++) {
            account[i] = new Account(i, 100);
        }

        while (true) {
            System.out.print("Enter an ID : ");
            int ID = input.nextInt();
            boolean isContinue = true;

            if (ID >= 0 && ID < account.length) {
                while (isContinue) {
                    int choice = showThePanel( input);
                    if (choice == 1) {
                        showTheBalance(account[ID]);
                    } else if (choice == 2) {
                        withdraw(account[ID], input);
                    } else if (choice == 3) {
                        deposit(account[ID], input);
                    } else if (choice==4){
                        isContinue=false;

                    }else {
                        System.out.println("Invalid choice");
                    }
                }
            } else {
                System.out.println("Enter the ID again");
            }
        }
    }

    public static int showThePanel(Scanner input) {
        System.out.print("Main Menu \n" +
                "1: Check balance\n" +
                "2: Withdraw\n" +
                "3: Deposit\n" +
                "4: Exit \n" +
                "Enter a choice : ");
        return input.nextInt();
    }

    public static void withdraw(Account account, Scanner input) {
        System.out.println("Enter an amount to withdraw");
        double amount = input.nextDouble();
        if (account.getBalance() < amount) {
            System.out.println("Insufficient Balance");
        } else {
            account.withdraw(amount);
        }

    }

    public static void showTheBalance(Account account) {
        System.out.println("The balance is :" + account.getBalance());
    }

    public static void deposit(Account account, Scanner input) {
        System.out.println("Enter an amount to deposit");
        double amount = input.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid Entrance");
        } else {
            account.deposit(amount);

        }
    }
}
