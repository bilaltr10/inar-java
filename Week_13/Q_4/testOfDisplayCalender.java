package Week_13.Q_4;

import java.util.Scanner;

public class testOfDisplayCalender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter the month ");
        int month = scanner.nextInt();


        DisplayCalendars displayCalendars = new DisplayCalendars(year,month);

       displayCalendars.writeTheCalender();
    }
}
