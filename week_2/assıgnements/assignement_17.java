package week_2.assıgnements;

import java.util.*;
//Write a program that prompts the user to enter a temperature between -58 ºF and 41ºF and
//a wind speed greater than or equal to 2 and displays the wind-chill temperature.

public class assignement_17 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter the temperature in Fahrenheit beyween -58F and 41F");
        double fahrenheit = bilal.nextDouble();
        do {
            if (fahrenheit <= -58 || fahrenheit >= 41) {
                System.out.println("we cannot make a measure with this fahrenheit degree");
                System.out.println("enter the temperature in Fahrenheit beyween -58F and 41F");
                fahrenheit = bilal.nextDouble();
            }
        } while ((fahrenheit <= -58 || fahrenheit >= 41));
        System.out.println("enter the wind speed in miles per hour it must be >=2 mph");
       double wind_speed = bilal.nextDouble();
        do{
            if (wind_speed<2 ) {
                System.out.println("we cannot make a measure with this value");
                System.out.println("enter the wind speed in miles per hour it must be >=2 mph");
                wind_speed = bilal.nextDouble();
            }
        }while ( wind_speed<2);

        double wind_chill_temperature = (35.74) + (0.6215*fahrenheit)-(35.75*Math.pow(wind_speed,0.16))+
                (0.4275*fahrenheit*Math.pow(wind_speed,0.16));
        System.out.println("the wind-chill temperature with the variables  you entered is   :"+ wind_chill_temperature);

    }


}
