package week_11.Q_1.Q_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AreaOFFConvex {

    AreaOFFConvex() {

    }

    public double AreaOfConvex(ArrayList<Double> list1, ArrayList<Double> list2) {
        int numberOfSides = list1.size();
        double area = 0;

        if (numberOfSides < 3) {
            System.out.println("Not avaible convex number of sides must be more than 2");
            return -1;
        }
        for (int i = 0; i < numberOfSides; i++) {
            int j = (i + 1) % numberOfSides;
            area += (list1.get(i) * list2.get(j) - (list1.get(j) * list2.get(i)));
        }

        area = Math.abs(area) / 2.0;

        return area;
    }

    public static void printClockwise(ArrayList<Double> list1, ArrayList<Double> list2) {


        int n = list1.size();

        // Çokgenin merkezi hesaplanır
        int centerX = 0;
        int centerY = 0;
        for (int i = 0; i < n; i++) {
            centerX += list1.get(i);
            centerY += list2.get(i);
        }
        centerX /= n;
        centerY /= n;

        List<Double[]> points = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            points.add(new Double[]{list1.get(i), list2.get(i)});
        }

        int finalCenterY = centerY;
        int finalCenterX = centerX;
        points.sort(Comparator.comparing(point -> {
            double angle = Math.atan2(point[1] - finalCenterY, point[0] - finalCenterX);
            return (angle < 0) ? (2 * Math.PI + angle) : angle;
        }));


    }}

