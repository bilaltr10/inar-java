package week_8_multiDimensinalArray;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_30 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] list = new double[2][2];
        double[] array = new double[2];
        System.out.println("Enter a00, a01, a10, a11, b0 and b1");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        double[] x = linearEquatition(list, array);
        if (x != null)
            System.out.print("X is " + x[0] + " and y is " + x[1]);
        else System.out.println("The equation has no solution");

    }

    public static double[] linearEquatition(double[][] list, double[] array) {

        double[] xAndY = new double[2];
        if (checkIsThereRealXAndY(list)) {
            return null;
        }

        return findthevalues(list, array, xAndY);

    }

    public static boolean checkIsThereRealXAndY(double[][] list) {

        return list[0][0] * list[1][1] - list[0][1] * list[1][0] == 0;


    }

    public static double[] findthevalues(double[][] list, double[] array, double[] xAndY) {

        xAndY[0] = (array[0] * list[1][1] - array[1] * list[0][1]) / (list[0][0] * list[1][1] - list[0][1] * list[1][0]);
        xAndY[1] = (array[1] * list[0][0] - array[0] * list[1][0]) / (list[0][0] * list[1][1] - list[0][1] * list[1][0]);

        return xAndY;


    }
}
