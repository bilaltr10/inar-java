package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_45_find_Mean_deviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String allNumbers = "";
        double total = 0;
        double exponentTotal = 0;
        int i;
        System.out.print("Enter 10 numbers : ");


        for (i = 1; i <= 10; i++) {

            double number = input.nextDouble();
            allNumbers += number + " ";
            total += number;
            exponentTotal += Math.pow(number, 2);

        }
        i--;


        double mean = total / i;
        System.out.println("The mean is " + mean);
        double deviation = Math.sqrt((exponentTotal - (Math.pow(total, 2) / i)) / (i - 1));
        System.out.println("Standart deviation is " + deviation);

    }
}
