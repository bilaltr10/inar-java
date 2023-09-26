package week_6;

import java.util.Scanner;
//(Financial application: compute commissions) Write a method that computes the
//commission, using the scheme below
public class assignment_11_compute_commissions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sales Amount            Comission");
        for (int i = 0; i <= 100000; i += 5000) {
            System.out.printf("%-22d    %.2f %s", i, computeCommission(i),"\n");
        }
    }

    public static double computeCommission(int amountOfSales) {
        double commission = 0;

        if (amountOfSales < 5000) {
            commission *= 0.08;
        } else if (amountOfSales <= 10000) {
            commission = 5000 * 0.08 + ((amountOfSales - 5000) * 0.10);
            ;
        } else  {
            commission = 5000 * 0.08 + 5000 * 0.10 + (amountOfSales - 10000) * 0.12;
        }

        return commission;
    }
}
