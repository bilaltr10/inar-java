package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Display leap years) Write a program that displays all the leap years, ten per line, from 101
//to 2100, separated by exactly one space. Also display the number of leap years in this
//period.
public class assignement_27_all_the_leap_years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayaç = 0;

        for (int i = 101; i <= 2100; i ++) {

            if ((!(i % 100== 0) && (i%4 ==0)) || i % 400 == 0) {
                System.out.print(i + " ");

                sayaç++;

                if (sayaç == 10) {
                    System.out.println();
              sayaç= 0;
                }


            }

        }


    }
}
