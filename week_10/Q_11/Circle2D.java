package week_10.Q_11;

public class Circle2D {
    private double x;
    private double y;

    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y) {
        double a = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
        return a <= radius;


    }

    public boolean contains(Circle2D circle) {
        double merkezUzaklik = Math.sqrt(Math.pow((this.x - circle.x), 2) + Math.pow((this.y - circle.y), 2));
        return merkezUzaklik + this.radius <= circle.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double merkezUzaklik = Math.sqrt(Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2));
        return merkezUzaklik < (this.radius + circle.radius) && merkezUzaklik >= Math.abs(this.radius - circle.radius);
    }

    public String toString(){
        return "Radius : "+ radius;
    }
}
