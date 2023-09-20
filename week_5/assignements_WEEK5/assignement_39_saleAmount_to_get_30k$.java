package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_39_saleAmount_to_get_30k$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double yourGoalToGet30k = 0;
        double target = 0;
        double newRemainig = 0;
        double faz1 = 0;
        double faz2 = 0;
        double faz3 = 0;

        while (target <= 30000) {

            if (yourGoalToGet30k <= 5000) {
                yourGoalToGet30k++;
                faz1 = yourGoalToGet30k *0.08;

            }
            if (yourGoalToGet30k > 5000 && yourGoalToGet30k <= 10000) {
                yourGoalToGet30k++;
                newRemainig = yourGoalToGet30k - 5001;
                faz2 = newRemainig * 0.10;
            }


            if (yourGoalToGet30k > 10000) {

                newRemainig = yourGoalToGet30k - 10000;
                yourGoalToGet30k++;
                faz3 = newRemainig * 0.12;
            }
            target = faz1 + faz2 + faz3;


        }
        System.out.println("Minimum sales to get $30.000 :"+yourGoalToGet30k);


    }


}

