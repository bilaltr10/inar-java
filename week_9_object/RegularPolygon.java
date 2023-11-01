package week_9_object;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    RegularPolygon() {

    }

    RegularPolygon(int numberOfSides, double lengthOfSides, double xCenter, double yCenter) {
        n = numberOfSides;
        side = lengthOfSides;
        x = xCenter;
        y = yCenter;

    }

    RegularPolygon(int numberOfSides, double lengthOfSides) {
        n = numberOfSides;
        side = lengthOfSides;
    }

    public void setN(int newN) {
        n = newN;
    }

    double getN() {
        return n;
    }

    public void setSide(int newSide) {
        side = newSide;
    }

    double getSide() {
        return side;
    }

    public void setX(int newX) {
        x = newX;
    }

    double getX() {
        return x;
    }

    public void setY(int newY) {
        y = newY;
    }

    double getY() {
        return y;
    }
    double getPerimeter(){
        return n*side;
    }
    double getArea(){
        return (n*Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
    }
}
