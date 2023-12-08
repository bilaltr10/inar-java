package Week_13.Q_12;

import Week_13.Q_5.Circle;
import Week_13.Q_5.GeometricObject;
import Week_13.Q_5.Rectangle;

/*(Sum the areas of geometric objects) Write a method that sums the areas of all the
        geometric objects in an array. The method signature is:
public static double sumArea(GeometricObject[] a)
        Write a test program that creates an array of four objects (two circles and two rectangles)
        and computes their total area using the sumArea method
*/
public class sumOfCircle {
    public static void main(String[] args) {
        GeometricObject [] list = new GeometricObject[4];

        list[0] = new Circle(45);
        list[1]= new Circle(12);
        list[2] = new Rectangle(4,5);
        list[3] = new Rectangle(8,5);

     double totalAreaOfGeoObjs =   calculateTotalArea(list);
        System.out.printf("Total area of geometric objects are %.2f " , totalAreaOfGeoObjs);
    }
    public static double calculateTotalArea(GeometricObject[] list){
       double totalArea= 0;
        for (GeometricObject geometricObject : list) {
            totalArea += geometricObject.getArea();
        }
        return totalArea;
    }
}
