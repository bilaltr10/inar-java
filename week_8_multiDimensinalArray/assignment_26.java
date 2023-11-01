package week_8_multiDimensinalArray;


import java.util.Scanner;

public class assignment_26 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row");
        double[][] list = assignment_25.makeTheList();
        System.out.println("Original array");
        assignment_13.showTheArray(list);
        System.out.println("Row sorted array");
        double[][] array = sortRows(list);
        assignment_13.showTheArray(array);


    }

    public static double[][] sortRows(double[][] list) {
        double[][] array = new double[list.length][list[0].length];
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list[0].length; j++) {
                min = findTheMin(list[i][j], min);
                max = findTheMax(list[i][j], max);
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
        array[i][0] = min;
        array[i][2] = max;
        for (int j = 0; j < list[0].length; j++) {
            if (list[i][j] != min && list[i][j] != max) {
                array[i][1] = list[i][j];
            }
        }

    }

}

