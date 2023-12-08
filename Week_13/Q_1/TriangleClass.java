package Week_13.Q_1;

public class TriangleClass extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public TriangleClass() {
        this(-1,-1,-1);
    }

    @Override
    public boolean Equals(Object circle) {
        return true;
    }

    public TriangleClass(double side1, double side2, double side3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleClass(double side1, double side2, double side3){

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public String toString() {
        return "Color : " + getColor() +
                "\nFilled : " + getFilled() +
                "\nTriangle : side1 : " + getSide1() +
                "\nTriangle : side2 : " + getSide2() +
                "\nTriangle : side3 : " + getSide3();

    }
}

