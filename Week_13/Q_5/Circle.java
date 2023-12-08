package Week_13.Q_5;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean Equals(Object o) {
        return false;
    }

    public String toString() {
        return "It is created on :" + date +
                "\nColor : " + getColor() +
                "\nisFilled : " + getFilled() +
                "\nRadius: " + radius +
                "\nArea:" + getArea() +
                "\nPerimeter : " + getPerimeter();
    }
}
