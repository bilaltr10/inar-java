package week_3.assignements;
import java.util.*;
//?) Write a program that prompts the user to enter
//a point (x, y) and checks whether the point is within the rectangle centered at you choose.


public class assignement_23 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("What is the center of rectangle? ");
        double xOfCenter = bilal.nextDouble();
        double yOfCenter = bilal.nextDouble();
        System.out.println("What width of rectangle? ");
        double widthOfrectangle = bilal.nextDouble();
        System.out.println("What is the height of rectangle?");
        double heightOfRectangle = bilal.nextDouble();
        System.out.println("Enter a point with two coordinates");
        double x = bilal.nextDouble();
        double  y = bilal.nextDouble();
        if (( (-(widthOfrectangle/2.0)<x && x < (widthOfrectangle/2.0)) && (-(heightOfRectangle/2.0)<x && x<( heightOfRectangle/2.0))) &&
        ( (-(widthOfrectangle/2.0)<y && y < (widthOfrectangle/2.0)) && (-(heightOfRectangle/2.0)<y && y< (heightOfRectangle/2.0))))
        {
            System.out.println("it is in the rectangle");
        }

        else System.out.println("it is not in the rectangle");


    }
}
