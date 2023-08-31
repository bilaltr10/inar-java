package week_3.assignements;

import java.util.*;
//(Health application: BMI) Body Mass Index (BMI) is a measure of health based on height
//and weight. It can be calculated by taking your weight in kilograms and dividing it by the
//square of your height in meters. The interpretation of BMI for people 20 years or older is as

public class assignement_6 {
    Scanner bilal = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.print("Welcome Dear Visitor Please Write Your Name");
        String nameSurname = bilal.nextLine();
        System.out.println("Dear " + nameSurname + " please enter your age ");
        int age = bilal.nextInt();
        if (age < 20) {
            System.out.println("The interpretation of BMI for people 20 years or older ");

        } else Branch(nameSurname, age);
    }

    public static void Branch(String nameSurname, double a) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("Dear " + nameSurname + " please fill the form correctly for better results");
        System.out.println("Please enter your weight in pounds ");
        double weight = bilal.nextDouble();
        double kgPounds = weight * 0.45359237;
        System.out.println("Please enter your feet");
        double feet = bilal.nextDouble();
        System.out.println("Please enter inches");
        double inches = bilal.nextDouble();
        double metersInches = ((feet * 12) + inches) * 0.0254;
        double BMI = kgPounds / Math.pow(metersInches, 2);
        BMI(BMI, nameSurname);
    }


    public static void BMI(double BMI ,String a ) {
        if (BMI < 18.5) System.out.println("Dear " + a+"your BMI is " + BMI + " and you are underweight");
        else if (18.5 <= BMI && BMI < 25.0) System.out.println("Dear " + a+"your BMI is " + BMI + " and you are normal ");
        else if (25.0 <= BMI && BMI < 30.0) System.out.println("Dear " + a+"your BMI is " + BMI + " and you are overweight");
        else {
            System.out.println("Dear " + a + "your BMI is " + BMI + " and you are obese");
            System.out.println("Please click here to have some support from Inar-Hospital Service ");
        }
    }
}