package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Display pyramid) Write a program that prompts the user to enter an integer from
//1 to 15 and displays a pyramid, as shown in the following sample run
public class assignement_17_pyramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı gir ");
        int sayı = input.nextInt();

        for (int i = 1; i <= sayı; i++) {
           for ( int a = sayı-i ; a >=0 ; a--) {
               System.out.print(" ");
           }
            for (int  m = 1; m <= i; m++) {
                System.out.print(m+ " ");
if ( m== i){
    System.out.println();
}
            }

        }
        }

    }




