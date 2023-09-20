package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_24_summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = a + 2;
        double total = 0;
        StringBuilder allNumbers = new StringBuilder();
        int count = 0;
        while (a <= 97) {
            total += (a / (b * 1.0));


            if (a < 97) {
                allNumbers.append(a).append("/").append(b).append(" + ");



            }
            else {
                allNumbers.append(a).append("/").append(b);
            }

            a = a + 2;
            b = b + 2;


        }
        System.out.println(total);
        System.out.println(allNumbers);


    }
}


