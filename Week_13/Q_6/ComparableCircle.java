package Week_13.Q_6;

import Week_13.Q_5.GeometricObject;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>  {

    public ComparableCircle() {

    }
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
@Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {

            return -1;
        }
    }


}

