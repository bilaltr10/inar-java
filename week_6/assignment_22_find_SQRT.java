package week_6;

import java.util.Scanner;


public class assignment_22_find_SQRT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer to learn its sqrt :");
        int number = input.nextInt();
        System.out.println("The approximated square rooot of " + number + "is : " + sqrt(number));
    }

    public static double sqrt(int number) {
        double lastGuess = 1;
        double nextGuess = 2;
        while ((nextGuess - lastGuess > 0.00001)) {
            nextGuess = ((lastGuess + number / lastGuess) / 2);
            lastGuess += 0.000001;
        }
        return Math.round(nextGuess);


    }
}
