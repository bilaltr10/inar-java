package Week_13.Q_5;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;

    java.util.Date date;


    public GeometricObject() {
        this("white", false);
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        date = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }


    public static GeometricObject max(GeometricObject geometricObject1, GeometricObject geometricObject2) {
        return geometricObject1.compareTo(geometricObject2) > 0 ? geometricObject1 : geometricObject2;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract  boolean Equals(Object o);


}
