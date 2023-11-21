package week_10.Q_4;

public class MyPoint {
    private  double x;
    private double y;

    MyPoint() {
        this(0, 0);

    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.x - x, 2) + Math.pow(myPoint.y - y, 2));
}

    double distance(double x , double y) {
        return (distance(new MyPoint(x,y)) );
    }


}
