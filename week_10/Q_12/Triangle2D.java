package week_10.Q_12;

import week_10.Q_4.MyPoint;
import week_10.Q_8.Tax;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(5, 5));
    }

    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double[] list = lengthOfSides();
        double s = 0;
        for (double v : list) {
            s += v;
        }
        s /= 2;
        return Math.sqrt((s * (s - list[0])) * (s * (s - list[1])) * (s * (s - list[2])));
    }

    public double[] lengthOfSides() {
        double[] list = new double[3];
        list[0] = distance(getP1().getX(), getP1().getY(), getP2().getX(), getP2().getY());
        list[1] = distance(getP2().getX(), getP2().getY(), getP3().getX(), getP3().getY());
        list[2] = distance(getP3().getX(), getP3().getY(), getP1().getX(), getP1().getY());
        return list;
    }

    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getPerimeter() {
        double[] list = lengthOfSides();
        double perimeter = 0;
        for (double v : list) {
            perimeter += v;
        }
        return perimeter;
    }

    public boolean contains(MyPoint p) {
        double x1 = getP1().getX();
        double y1 = getP1().getY();
        double x2 = getP2().getX();
        double y2 = getP2().getY();
        double x3 = getP3().getX();
        double y3 = getP3().getY();
        double s = 1 / (2 * getArea()) * (y1 * x3 - x1 * y3 + (y3 - y1) * p.getX() + (x1 - x3) * p.getY());
        double t = 1 / (2 * getArea()) * (x1 * y2 - y1 * x2 + (y1 - y2) * p.getX() + (x2 - x1) * p.getY());
        return s > 0 && t > 0 && 1 - s - t > 0;
    }

    public boolean contains(Triangle2D t) {
        double s1 = t.getArea();
        double s2 = getArea();
        double x1 = getP1().getX();
        double y1 = getP1().getY();
        double x2 = getP2().getX();
        double y2 = getP2().getY();
        double x3 = getP3().getX();
        double y3 = getP3().getY();
        double xA = t.getP1().getX();
        double yA = t.getP1().getY();
        double xB = t.getP2().getX();
        double yB = t.getP2().getY();
        double xC = t.getP3().getX();
        double yC = t.getP3().getY();
        boolean corner1Inside = (x1 - xA) * (y2 - yA) - (y1 - yA) * (x2 - xA) > 0;
        boolean corner2Inside = (x2 - xB) * (y3 - yB) - (y2 - yB) * (x3 - xB) > 0;
        boolean corner3Inside = (x3 - xC) * (y1 - yC) - (y3 - yC) * (x1 - xC) > 0;
        boolean areaCheck = s1 < s2;

        return corner1Inside && corner2Inside && corner3Inside && areaCheck;
    }

    public boolean overlaps(Triangle2D t) {
        double x1 = getP1().getX();
        double y1 = getP1().getY();
        double x2 = getP2().getX();
        double y2 = getP2().getY();
        double x3 = getP3().getX();
        double y3 = getP3().getY();
        double xA = t.getP1().getX();
        double yA = t.getP1().getY();
        double xB = t.getP2().getX();
        double yB = t.getP2().getY();
        double xC = t.getP3().getX();
        double yC = t.getP3().getY();
        boolean corner1Inside = isInside(x1, y1, x2, y2, x3, y3, xA, yA);
        boolean corner2Inside = isInside(x1, y1, x2, y2, x3, y3, xB, yB);
        boolean corner3Inside = isInside(x1, y1, x2, y2, x3, y3, xC, yC);

        boolean cornerAInside = isInside(xA, yA, xB, yB, xC, yC, x1, y1);
        boolean cornerBInside = isInside(xA, yA, xB, yB, xC, yC, x2, y2);
        boolean cornerCInside = isInside(xA, yA, xB, yB, xC, yC, x3, y3);

        // İki üçgenin kenarlarının kesişip kesişmediğini kontrol et
        boolean edgesIntersect = doIntersect(x1, y1, x2, y2, xA, yA, xB, yB) ||
                doIntersect(x1, y1, x2, y2, xB, yB, xC, yC) ||
                doIntersect(x1, y1, x2, y2, xC, yC, xA, yA) ||
                doIntersect(x2, y2, x3, y3, xA, yA, xB, yB) ||
                doIntersect(x2, y2, x3, y3, xB, yB, xC, yC) ||
                doIntersect(x2, y2, x3, y3, xC, yC, xA, yA) ||
                doIntersect(x3, y3, x1, y1, xA, yA, xB, yB) ||
                doIntersect(x3, y3, x1, y1, xB, yB, xC, yC) ||
                doIntersect(x3, y3, x1, y1, xC, yC, xA, yA);

        // Her iki üçgenin köşelerinin ve kenarlarının kesişip kesişmediğini kontrol et
        return (corner1Inside || corner2Inside || corner3Inside || cornerAInside || cornerBInside || cornerCInside || edgesIntersect);
    }

    public static boolean isInside(double x1, double y1, double x2, double y2, double x3, double y3, double x, double y) {
        double area = 0.5 * (-y2 * x3 + y1 * (-x2 + x3) + x1 * (y2 - y3) + x2 * y3);
        double s = 1 / (2 * area) * (y1 * x3 - x1 * y3 + (y3 - y1) * x + (x1 - x3) * y);
        double t = 1 / (2 * area) * (x1 * y2 - y1 * x2 + (y1 - y2) * x + (x2 - x1) * y);
        return s > 0 && t > 0 && 1 - s - t > 0;
    }

    public static boolean doIntersect(double x1, double y1, double x2, double y2,
                                      double x3, double y3, double x4, double y4) {
        // Doğruların kesişip kesişmediğini kontrol et
        double o1 = orientation(x1, y1, x2, y2, x3, y3);
        double o2 = orientation(x1, y1, x2, y2, x4, y4);
        double o3 = orientation(x3, y3, x4, y4, x1, y1);
        double o4 = orientation(x3, y3, x4, y4, x2, y2);

        // Farklı yönlere bakıyorsa kesişme var
        return (o1 != o2 && o3 != o4);
    }

    public static double orientation(double x1, double y1, double x2, double y2, double x3, double y3) {
        double val = (y2 - y1) * (x3 - x2) - (x2 - x1) * (y3 - y2);
        if (val == 0) return 0;  // doğru üstünde
        return (val > 0) ? 1 : 2; // saat yönünde veya saat yönünün tersine
    }

    public void xx(){

    }
}
