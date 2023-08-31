package week_4.assignements;
import java.util.*;
//import java.lang.*;
//(Geometry: area of a hexagon) The area of a hexagon can be computed using the following
//formula (s is the length of a side)



public class assignement_4_Area_Of_Hexogan {


    public static void main(String[] args) {
        Scanner bilal = new Scanner ( System.in);

        System.out.println("Enter the value of the side of hexogen");
        double valueofSide = bilal.nextDouble();

        double areaOfHexogen =( 6*Math.pow(valueofSide,2))/(4*Math.tan(Math.PI/6));
        System.out.printf("The area of the hexogen is %.2f ",areaOfHexogen);

    }

}
