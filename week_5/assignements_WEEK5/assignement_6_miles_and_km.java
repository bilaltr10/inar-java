package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_6_miles_and_km {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int m = 20;
        System.out.printf("%s  %8s  %c  %8s  %8s ","MILES","KILOMETERS ",'|',"KILOMETERS","MILES");
        System.out.println();
        while (i <= 10 && m <=65 ) {
            System.out.printf("%d %8s %.2f", i, "", i*1.609);
            System.out.print("     |  ");
            System.out.printf("%d %8s %.2f",m ,"", m/1.609 );
            System.out.println();
            i ++;
            m += 5;
        }
    }
}
