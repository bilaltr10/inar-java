package week_6;

import java.util.Scanner;
//(Conversions between Celsius and Fahrenheit)
public class assignment_8_Conversions_between_Celsius_and_Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.printf("%-10s %-10s   |    %-15s  %-10s", "Celsius", "Fahreneit", "Fahrenheit", "Celsius");
        System.out.println();
        for (int a = 0; a < 10; a++) {
            for (double i = 40 - a; i >= 40 - a; i--) {
                System.out.printf("%-10.1f %-18.1f", i, celsiusToFahrenheit(i));
            }
            for (double i = 120 - 10 * a; i >= 120 - 10 * a; i -= 10 * i) {
                System.out.printf(" %-15.1f %-10.2f ", i, fahrenheitToCelsius(i));
            }
            System.out.println();

        }
    }

    public static double celsiusToFahrenheit(double degree) {

        double fahrenheit = (9.0 / 5) * degree + 32;
        return fahrenheit;

    }

    public static double fahrenheitToCelsius(double degree) {

        double celsius = (5.0 / 9) * (degree - 32);
        return celsius;
    }

}
