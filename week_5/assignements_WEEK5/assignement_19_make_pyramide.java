package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_19_make_pyramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Bir sayı gir ");
        int sayı = input.nextInt();
        for (int i = 0; i <= sayı-1; i++) {

            for (int a = sayı - i - 1; a >= 0; a--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i- 1; k++) {
                System.out.print(" " + (int) Math.pow(2,k));

            }

            for ( int f =i ; f<= i; f++) {
                System.out.print(" " + (int) Math.pow(2, f) + " ");
                if (i == 0)
                    System.out.println();
            }

            for ( int l =i ; l >= 1; l--) {
                System.out.print((int) Math.pow(2, l-1)+ " ");
            if (l == 1) {
                System.out.println();
            }
            }


        }
            }
        }



