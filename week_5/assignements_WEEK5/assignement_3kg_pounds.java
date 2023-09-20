package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Conversion from kilograms to pounds) Write a program that displays the following table
//(note that 1 kilogram is 2.2 pounds)
public class assignement_3kg_pounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Until which weight you want to learn pound value of kg ");
        int valueOfKg = input.nextInt();
        int kilogram = 1;
        double pound = 0;
int i= 10;
        System.out.printf("%s %12s   ", "KİLOGRAMS", "POUNDS");
        System.out.println();
        while (kilogram <= valueOfKg) {
            System.out.printf("%d %14s %3.2f ", kilogram, "    ", kilogram * 2.2);
            System.out.println();
kilogram++;

        }

        }


    }

