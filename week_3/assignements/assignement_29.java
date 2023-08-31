package week_3.assignements;

import java.util.*;
//Write a program that prompts the user to enter the center
//coordinates and radii of two circles and determines whether the second circle is
//inside the �rst or overlaps with the �rst, as shown in Figure 3.10. (Hint: circle2 is
//inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
//overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
//program to cover all cases.


public class assignement_29 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        double xOfCircleOne, yOfCircleOne, xOfCircleTwo, yOfCircletwo, radiusOfCircleOne, radiusOfCircleTwo;

        System.out.println(" Enter circle - 1 's x , y coordinates and radius ");
        xOfCircleOne = bilal.nextDouble();
        yOfCircleOne = bilal.nextDouble();
        radiusOfCircleOne = bilal.nextDouble();

        System.out.println("Enter circle - 2 's x,y coordinates and radius ");
        xOfCircleTwo = bilal.nextDouble();
        yOfCircletwo = bilal.nextDouble();
        radiusOfCircleTwo = bilal.nextDouble();

        double distanceBetweenTwoCenters = Math.sqrt(Math.pow(xOfCircleTwo - xOfCircleOne, 2) + Math.pow(yOfCircletwo - yOfCircleOne, 2));

        if (distanceBetweenTwoCenters == Math.abs(radiusOfCircleOne - radiusOfCircleTwo)) {
            System.out.println("circle2 is inside circle1");
        }
else if (distanceBetweenTwoCenters<= radiusOfCircleOne+radiusOfCircleTwo){

            System.out.println("circle 2 overlaps circle1 ");
        }
else {
            System.out.println("These two circle doesnt overlaps");
        }
    }
}
