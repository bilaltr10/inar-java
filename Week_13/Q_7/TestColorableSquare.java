package Week_13.Q_7;

import Week_13.Q_6.GeometricObject;

public class TestColorableSquare {
    public static void main(String[] args) {
        GeometricObject[] list = new GeometricObject[5];

        list[0] = new Square(5);
        list[1] = new Square(4.7);
        list[2] = new Square(45);
        list[3] = new Square(12);
        list[4] = new Square(1.8);


        for (int i = 0; i < list.length; i++) {
            System.out.println("Area of Geometric Object in the index " + i + " is " + list[i].getArea());
          ((Square)list[i]).howToColor();
            System.out.println("_____________________________________________________________________");

        }
    }
}
