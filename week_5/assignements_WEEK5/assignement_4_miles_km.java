package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_4_miles_km {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("MİLES------------------>KİLOMETERS");
        System.out.println();
        int a = 1;
        while (  a <=10){
            System.out.printf("%-5d %21s %f",a,"",(a*1.609));
            System.out.println();
            a++;
        }


    }
}
