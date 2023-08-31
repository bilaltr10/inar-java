package week_3.assignements;
import java.util.*;
import java.lang.*;
//Write a program that prompts the user to enter a
//point (x, y) and checks whether the point is within the circle centered at (0, 0)
//with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
//circle, as shown in Figure 3.7a.
//(Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
//The formula for computing the distance is ((𝑥2 − 𝑥1) + (𝑦2 − 𝑦1)2)*1/2;
//program to cover all cases.) Two sample runs are shown below

public class assignement_22 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("What is the center of cirle ");
        double xOfCenter = bilal.nextDouble();
        double yOfCenter = bilal.nextDouble();
        System.out.println("What is the radius of circle ");
        double perimeterOfCircle = bilal.nextDouble();
        System.out.println("Enter a point with two coordinates");
         double x = bilal.nextDouble();
        double  y = bilal.nextDouble();
       double calculation =Math.pow((Math.pow((x-xOfCenter),2)+ Math.pow((y-yOfCenter),2) ),0.5);

        if( calculation >= perimeterOfCircle ) System.out.println("("+ x+ " ,"+y +") is not in the circle");
        else{
            System.out.println("("+ x+ " ,"+y +") is  in the circle");
        }


    }
}
