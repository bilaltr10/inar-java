package  week_11.Q_1;



/*■ A method named getPerimeter() that returns the perimeter of this triangle.
■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Question_02_19.
The toString() method is implemented as follows: return "Triangle: side1 = " +
side1 + " side2 = " + side2 + " side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is �lled. The program should create a Triangle object with these sides and set
the color and �lled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is �lled or not.
Output */
public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double s_total = getPerimeter() / 2;
        return Math.sqrt(s_total * (s_total - side1) * (s_total - side2) * (s_total - side3));

    }

    @Override
    public String toString() {
        return "Triangle: side1 = " +
                side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}
