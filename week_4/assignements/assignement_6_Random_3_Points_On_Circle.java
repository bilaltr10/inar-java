package week_4.assignements;

import java.util.*;

//Write a program that generates three random points on a circle
//centered at (0, 0) with radius 40 and display three angles in a triangle formed by these three
//points, as shown in Figure 4.6a.
//(Hint: Generate a random angle a in radians between 0 and 2p, as shown in Figure 4.6b and
//the point determined by this angle is (r*cos(a), r*sin(a)).)
public class assignement_6_Random_3_Points_On_Circle {

    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);
        double[] array1 = new double[6];

        for (int i = 0; i <= 4; i += 2) {
            double randomDegree = Math.random() * 360;

            double a = Math.toRadians(randomDegree);

            double x = 10 * (Math.cos(a));
            double y = 10 * (Math.sin(a));

            array1[i] = x;
            array1[i + 1] = y;

        }

        double distanceA_B = Math.sqrt(Math.pow(array1[2] - array1[0], 2) + Math.pow(array1[3] - array1[1], 2));
        double distanceA_C = Math.sqrt(Math.pow(array1[4] - array1[0], 2) + Math.pow(array1[5] - array1[1], 2));
        double distanceB_C = Math.sqrt(Math.pow(array1[4] - array1[2], 2) + Math.pow(array1[5] - array1[3], 2));

        double degreeOfA= (((distanceA_B*distanceA_B)+(distanceA_C*distanceA_C)-(distanceB_C*distanceB_C))/2*distanceA_C*distanceA_B);

        System.out.println(distanceA_B);
        System.out.println(distanceA_C);
        System.out.println(distanceB_C);
        double angleRadians = Math.acos(degreeOfA);
        double angleDegrees = Math.toRadians(angleRadians);

        System.out.println("Açı (radyan): " + angleRadians);
        System.out.println("Açı (derece): " + angleDegrees);

    }
}
