package Week_13.Q_5;

public class Rectangle extends GeometricObject {

    private double sideLong;
    private double sideSmall;

    public Rectangle(double sideLong, double sideSmall) {
        this.sideSmall = sideSmall;
        this.sideLong = sideLong;
    }


    public double getSideLong() {
        return sideLong;
    }

    public void setSideLong(double sideLong) {
        this.sideLong = sideLong;
    }

    public double getSideSmall() {
        return sideSmall;
    }

    public void setSideSmall(double sideSmall) {
        this.sideSmall = sideSmall;
    }



    @Override
    public double getArea() {
        return sideLong*sideSmall;
    }

    @Override
    public double getPerimeter() {
        return 2*(sideLong+sideSmall);
    }

    @Override
    public boolean Equals(Object o) {
        return false;
    }

    public String toString() {
        return "It is created on :" + date +
                "\nColor : " + getColor() +
                "\nisFilled : " + getFilled() +
                "\nWidth: " + sideSmall +
                "\nHeight : "+ sideLong+
                "\nArea:" + getArea() +
                "\nPerimeter : "+ getPerimeter();
    }

}
