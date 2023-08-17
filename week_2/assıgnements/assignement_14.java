package week_2.assıgnements;

import java.util.*;

public class assignement_14 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("welcome Inar health Group ");
        String click = bilal.next();
        System.out.println("please write your name and surname ");
        String name = bilal.next();
        String surname = bilal.next();
        System.out.println("dear " + name + "  " + surname + " for better health you must have BMI less than 15 ");
        click = bilal.next();
        System.out.println("let 's start ");
        click = bilal.next();
        System.out.println("write your weight in pounds ");
        double pound = bilal.nextDouble();
        double kg = pound * 0.45359237;
        System.out.println("write your height in inces ");
        double inches = bilal.nextDouble();
        double meters = inches * 0.0254;
        System.out.println("dear " + name + " " + surname + " your IBM is " + kg / Math.pow(meters, 2.0));


    }
}
