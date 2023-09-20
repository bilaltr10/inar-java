package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_33_real_perfect_numbers_until_certain_point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factor = 1;
        int total = 0;

        System.out.println("Perfect Numbers Are :");
        for (int i = 2; i < 200000; i++) {
            factor = 1;
            total = 0;

            while (factor < i) {

                if (i % factor == 0) {
                    total += factor;

                }
                factor++;

            }
            if (total == i) {
                System.out.println(total);
            }


        }


    }
}
