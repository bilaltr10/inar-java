package week_4.assignements;
import java.util.*;
//(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in which all
//sides are of the same length and all angles have the same degree (i.e., the polygon is both
//equilateral and equiangular). The formula for computing the area of a regular polygon is

// area = n*side*side /4*tan(pi/n);



public class assignement_5_Area_Of_Polygone {
    public static void main(String[] args) {

        Scanner bilal = new Scanner(System.in);

        System.out.printf("Enter the number of sides ");
        double side = bilal.nextDouble();

        System.out.printf("Enter the length of side ");
        double lengthOfside= bilal.nextDouble();

        double areaOfPolygon = (side*Math.pow(lengthOfside,2))/ (4*Math.tan(Math.PI/side));

        System.out.printf("The area of polygon is : %.3f" , areaOfPolygon);
    }
}
