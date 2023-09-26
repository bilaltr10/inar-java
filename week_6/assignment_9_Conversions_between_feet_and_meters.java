package week_6;

import java.util.Scanner;

public class assignment_9_Conversions_between_feet_and_meters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%-10s %-10s   |    %-15s  %-10s", "Feet", "Meters", "Meters", "Celsius");
        System.out.println();
        for (int a = 1; a <= 10; a++) {
            for (double i = a; i <= a; i++) {
                System.out.printf("%-10.1f %-18.3f", i, footToMeter(i));
            }
            for (double i = 15 + 5 * a; i <= 15 + 5 * a; i += 5 * i) {
                System.out.printf(" %-15.1f %-10.3f ", i, meterToFoot(i));
            }
            System.out.println();

        }
    }

    public static double footToMeter(double number) {
        double meter = 0.305 * number;
        return meter;

    }

    public static double meterToFoot(double number) {
        double foot = 3.279 * number;
        return foot;


    }

}