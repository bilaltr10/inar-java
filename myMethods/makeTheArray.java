package myMethods;

import java.util.Scanner;

public class makeTheArray {
    static Scanner input= new Scanner(System.in);
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
}
