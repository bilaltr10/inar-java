package Week_13.Q_7;

import Week_13.Q_6.GeometricObject;

public class Square extends GeometricObject implements Colorable {

private  double side;

    public Square(double side) {

        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(),2);
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }

    @Override
    public boolean Equals(Object circle) {
        return false;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four areas");
    }
}
