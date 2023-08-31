package week_4.assignements;
import java.util.*;
//Write a program that prompts the user to enter the length
//from the center of a pentagon to a vertex and computes the area of the pentagon...

// s= side of pentagon r = from center of pentagon to vertex
// s = 2*re*sin pi/5;
// area of pentagon = 5*s*2/4*tanPİ/5
//r = radius of circle in the pentagram
// kullanıcı yalnız r yi girecek
public class assignement_1 {

    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex");
        double lengthFromCenterToVertex = bilal.nextDouble();

        double sideOfPentagon = 2*lengthFromCenterToVertex*Math.sin(Math.PI/5);

        double areaOfPentagon = (5*sideOfPentagon*sideOfPentagon) / (4*Math.tan(Math.PI/5));

        System.out.printf("The area of the pentagon : %.2f ",areaOfPentagon);


    }
}
