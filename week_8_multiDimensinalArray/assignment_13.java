package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] list = makeTheArray();
        showTheArray(list);

        int[] indexOfBiggestNumber = findTheBiggestNumber(list);
        System.out.printf("The location of the largest element is (%d,%d)", indexOfBiggestNumber[0], indexOfBiggestNumber[1]);
    }


    public static double[][] makeTheArray() {
        System.out.println("Enter the number of rows and columns of the array : ");
        int numberOfColumn = input.nextInt();
        int numberOfRows = input.nextInt();

        double[][] list = new double[numberOfRows][numberOfColumn];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = Math.random() * 40;
            }
        }
        return list;
    }

    public static void showTheArray(double[][] list) {

        for (double[] doubles : list) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.printf("%-5.2f  ", doubles[j]);
            }
            System.out.println();
        }
    }

    public static int[] findTheBiggestNumber(double[][] list) {
        double max = Integer.MIN_VALUE;
        int[] placeOfBiggestNumber = new int[2];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j] > max) {
                    max = list[i][j];
                    placeOfBiggestNumber[0] = i;
                    placeOfBiggestNumber[1] = j;
                }
            }
        }
        return placeOfBiggestNumber;
    }


}
