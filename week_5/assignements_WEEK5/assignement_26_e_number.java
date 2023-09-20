package week_5.assignements_WEEK5;

import java.util.Scanner;
// benim 0,13 ü kim çalıyor len !!!!!
public class assignement_26_e_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = 1;

        int user = input.nextInt();
        double total = 1;
        double alttotal = 1;
        for (int i = 1; i <= user; i++) {

            for ( m = 1; m <= i; m++) {
                alttotal *= m;

            }
            total += 1.0 / alttotal;

        }
        System.out.println("e at i =" + user + " is  " + ((total)));
        System.out.println("Java's e is " + Math.exp(1));

    }
}
