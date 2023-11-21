package week_10.Q_12;
import week_10.Q_4.MyPoint;

public class test {
    public static void main(String[] args) {
        Triangle2D test = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));

        System.out.println("Area : "+test.getArea());
        System.out.println("Perimeter : "+test.getPerimeter());
        System.out.println("Contains (3,3) ? : "+ test.contains(new MyPoint(2.9,2)));
        System.out.println("test contains the triangle  : ? "+test.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("test overlaps the triangle : ? "+test.contains(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));


        System.out.println();
        System.out.println(System.currentTimeMillis()/(1444*1000*60));

    }
}
