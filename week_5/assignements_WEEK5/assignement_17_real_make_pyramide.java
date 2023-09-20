package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_17_real_make_pyramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Bir sayı gir ");
        int sayı = input.nextInt();
        for (int i = 1; i <= sayı; i++) {

            for (int a = sayı - i-1; a >= 0; a--) {
                System.out.print("  ");
            }
            for (int k = ((sayı) - (sayı - i)); k >= 2; k--) {
                System.out.print(" " +k);

            }

            for (int f = 1; f <= 1; f++) {
                System.out.print(" "+ f+" ");
            }


            for (int k = 2; k <= ((sayı) - (sayı - i)); k++) {
                System.out.print(k+ " ");

                if (k == ((sayı) - (sayı - i))) {
                    System.out.println();

                }

            }
            if (i == 1) {
                System.out.println();
            }
        }

    }

}

