package week_9_object;

import java.awt.*;

public class testOf_Poliygon {
    public static void main(String[] args) {
      RegularPolygon regularPolygon = new RegularPolygon();
      RegularPolygon regularPolygon1 = new RegularPolygon(6,4);
      RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);

        System.out.print("First RegularPolygon perimeter is : "+regularPolygon.getPerimeter());
        System.out.println("  area is :  "+ regularPolygon.getArea());
        System.out.print("Second RegularPolygon perimeter is : "+regularPolygon1.getPerimeter());
        System.out.println("  area is :  "+ regularPolygon1.getArea());
        System.out.print("Third RegularPolygon perimeter is : "+regularPolygon2.getPerimeter());
        System.out.println("  area is :  "+ regularPolygon2.getArea());



    }
}
