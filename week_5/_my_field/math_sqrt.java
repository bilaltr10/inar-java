package week_5._my_field;

import java.util.Scanner;

//Implement a Java function that computes the square root of a number
// without using any built-in library functions or mathematical operators.
public class math_sqrt {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Karekökünü bulmak istediğiniz sayıyı girin:");
        double number = input.nextDouble();
        double x = 0;
        while (x * x < number) {
            x += 0.0001;
        }
        System.out.printf("%.2f sayısının karekökü %.4f dir.", number, x);*/
        Scanner bilal = new Scanner(System.in);

        System.out.print("Write a number for its squart :");
        double input = bilal.nextInt();
        double number = number_sqrt(input);
        System.out.printf("%.2f nin karekökü %.4f ", input, number);

    }

    public static double number_sqrt(double input) {
        double mth = 0;

        //     for (int i = 0; i <= input; i++) {
        for (double m = 2; m <= input; m++) {
            if (m * m == input) {
                mth = m;

            } else if (input > m * m && input < (m + 1) * (m + 1)) {
                while (m * m < input) {
                    m += 0.0001;
                }
                mth = m;
            }
        }
        //   }
        return mth;
    }
}




