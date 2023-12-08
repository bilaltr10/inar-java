package Week_13.Q_9;

import Week_13.Q_5.GeometricObject;

public class Circle extends GeometricObject implements Comparable<GeometricObject> {
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(String color, boolean isfilled, double radius) {
        this.radius = radius;
        setColor(color);
        setFilled(isfilled);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }
@Override
    public boolean Equals(Object circle) {
        return compareTo((Circle) circle) == 0;
    }

    public int compareTo(Circle o) {
        if(this.getRadius()>o.getRadius())return 1;
        if(this.getRadius()==o.getRadius())return 0;
        else return -1;
    }
}
