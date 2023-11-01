package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_27 {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row");
        double[][] list = assignment_25.makeTheList();
        System.out.println("Original array");
        assignment_13.showTheArray(list);
        System.out.println("Column sorted array");
        double[][] array = sortColumn(list);
        assignment_13.showTheArray(array);

    }

    public static double[][] sortColumn(double[][] list) {
        double[][] array = new double[list.length][list[0].length];
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < list[0].length; i++) {

            for (double[] doubles : list) {
                min = findTheMin(doubles[i], min);
                max = findTheMax(doubles[i], max);
            }
            sendToTheArray(list, min, max, i, array);
        }

        return array;
    }

    public static double findTheMin(double a, double b) {
        return Math.min(a, b);
    }

    public static double findTheMax(double a, double b) {
        return Math.max(a, b);
    }

    public static void sendToTheArray(double[][] list, double min, double max, int i, double[][] array) {
        array[0][i] = min;
        array[2][i] = max;
        for (int j = 0; j < list.length; j++) {
            if (list[j][i] != min && list[j][i] != max) {
                array[1][i] = list[j][i];
            }
        }

    }

}
