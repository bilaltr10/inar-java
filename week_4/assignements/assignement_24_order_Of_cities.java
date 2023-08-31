package week_4.assignements;

import java.util.*;

//) Write a program that prompts the user to enter three cities and displays
//them in ascending order.
public class assignement_24_order_Of_cities {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.print("How many cities you want to enter :");
        int numberOfCities = bilal.nextInt();
        String[] namesOfCities = new String[numberOfCities];
        System.out.println("Write "+numberOfCities+" cities ");


        for (int i = 0; i <= numberOfCities-1; i++) {
            System.out.print((i + 1) + ". city is : ");
            String city = bilal.next().toUpperCase();
            namesOfCities[i] = city;
        }

        for (String a : namesOfCities) {
            System.out.println(a);
        }
        for (int m = 0; m <= namesOfCities.length - 1; m++) {
            for (int i = 1; i <= namesOfCities.length-m-1 ; i++) {
                if (namesOfCities[i - 1].compareToIgnoreCase(namesOfCities[i]) > 0) {
                    String x = null;
                    x = namesOfCities[i - 1];
                    namesOfCities[i - 1] = namesOfCities[i];
                    namesOfCities[i] = x;
                }

            }
        }
        System.out.println("*********************************");

        for (String a : namesOfCities) {
            System.out.println(a);
        }
    }

}
