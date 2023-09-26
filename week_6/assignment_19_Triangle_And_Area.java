package week_6;

import java.util.Scanner;
//Write a test program that reads three sides for a triangle and computes the area if the input
//is valid. Otherwise, it displays that the input is invalid.
public class assignment_19_Triangle_And_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of sides of triangle ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if((isValid(side1,side2,side3))){
            System.out.println("The area of the triangle is : "+area(side1,side2,side3));
        }
        else{
            System.out.println("Invalid input(Hey buddy no way to make a triangle with these values :xD)");
        }
    }
    public static boolean isValid(double s1 ,double s2 ,double s3){

return (s1 + s2 >s3 && s1+s3>s2 && s2+s3>s1) ;

    }

    public static double area(double side1 ,double side2 ,double side3){

        double s_total = (side1+side2+side3)/2;


        return  Math.sqrt(s_total*(s_total-side1)*(s_total-side2)*(s_total-side3));
    }
}
