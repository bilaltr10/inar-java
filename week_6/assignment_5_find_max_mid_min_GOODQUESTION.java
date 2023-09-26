package week_6;

import java.util.Scanner;
//Write a method with the following header to display three numbers in
//increasing order
public class assignment_5_find_max_mid_min_GOODQUESTION {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp = 0;
        double tempMin = 0;
        double max = 0;
        double mid = 0;
        double min = 0;

        temp = Math.max(num1, num2);
        max = Math.max(temp, num3);

        tempMin = Math.min(num1, num2);
        min = Math.min(tempMin, num3);

        if ((max == num1 && min == num2) || (max == num2 && min == num1)) {
            mid = num3;
        } else if ((max == num2 && min == num3) || (max == num3 && min == num2)) {
            mid = num1;
        } else if ((max == num1 && min == num3) || (max == num3 && min == num1)) {
            mid = num2;
        }


        System.out.printf("%.1f-----%.1f-----%.1f ", min, mid, max);
    }
}
