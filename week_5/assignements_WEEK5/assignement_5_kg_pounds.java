package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Conversion from kilograms to pounds and pounds to kilograms) Write a program that
//displays the following two tables side by side
public class assignement_5_kg_pounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int i = 1;
        int m = 20;
        System.out.printf("%8s  %8s  %c  %8s  %8s ","KILOGRAMS","POUNDS ",'|',"POUNDS","KILOGRAMS");
        System.out.println();
        while (i <= 200 && m <=515 ) {
            System.out.printf("%d %8s %.2f", i, "", i * 2.2);
            System.out.print("  |  ");
            System.out.printf("%d %8s %.2f",m ,"", m/2.2 );
            System.out.println();
            i += 2;
            m += 5;
        }

    }
}
