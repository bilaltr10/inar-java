package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_42_salesAmount_to_get_promotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yourGoalToGet30k = 0;
        double total = 0;
        double newRemainig = 0;
        double faz1 = 0;
        double faz2 = 0;
        double faz3 = 0;

        System.out.print("Enter the commission sought : ");
        double targetOfSaler = input.nextDouble();

        for (yourGoalToGet30k=0;total<=targetOfSaler ; yourGoalToGet30k++) {
total=0;
            if (yourGoalToGet30k <= 5000) {
                faz1 = yourGoalToGet30k * 0.08;

            }

            if (yourGoalToGet30k > 5000 && yourGoalToGet30k <= 10000) {
                newRemainig = yourGoalToGet30k - 5001;
                faz2 = newRemainig * 0.10;
            }


            if (yourGoalToGet30k > 10000) {

                newRemainig = yourGoalToGet30k - 10000;
                faz3 = newRemainig * 0.12;
            }

            total = faz1 + faz2 + faz3;


        }
        System.out.println("Minimum sales to get $" + targetOfSaler + " is : $" + yourGoalToGet30k);

    }
}
