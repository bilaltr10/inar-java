package week_4.assignements;

import java.util.*;

//
public class assignement_2_One_Point_On_Earth {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        final double radius = 6371.01;

        System.out.println("Lets find out great circle of distance between the two points on earth");
        System.out.println("Important : The latitude\n" +
                "and longitude degrees in the formula are for north and west. Use negative to indicate south\n" +
                "and east degrees");
        System.out.print("Enter the altitude of first point : ");
        double altitudeOfFirstPoint = bilal.nextDouble();
        System.out.print("Enter the longtitude of first point ");
        double longtitudeOfFirstPoint = bilal.nextDouble();

        System.out.print("Enter the altitude of second point : ");
        double altitudeOfSecondPoint = bilal.nextDouble();
        System.out.print("Enter the longtitude of second point ");
        double longtitudeOfSecondPoint = bilal.nextDouble();

        double /*radianOfaltitudeOfFirstPoint*/ x1 = Math.toRadians(altitudeOfFirstPoint);
        double /*radianOflongtitudeOfFirstPoint*/ y1 = Math.toRadians(longtitudeOfFirstPoint);
        double/* radianOfaltitudeOfSecondPoint */x2 = Math.toRadians(altitudeOfSecondPoint);
        double /*radianOflongtitudeOfSecondPoint*/y2 = Math.toRadians(longtitudeOfFirstPoint);

        double distance = radius *
                Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                Math.cos(Math.toRadians(y1 - y2)));

        System.out.printf("The distance between the points of ( %.2f  , %.2f ) and ( %.2f , %.2f ) is : %f km", altitudeOfFirstPoint, longtitudeOfFirstPoint, altitudeOfSecondPoint, longtitudeOfSecondPoint, distance);


    }
}
