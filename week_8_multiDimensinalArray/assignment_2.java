package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] list = new double[4][4];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = (Math.random() * 10) + 1;
                System.out.printf("%-5.1f ",list[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Sum of the elements in the major diagonal : %.1f ", sumMajorDiagonal(list));
    }
    public static double sumMajorDiagonal(double [][] list){
        double total_1 =0;
        double total_2=0;

        for (int i = 0; i <list.length ; i++) {
            for (int j = i; j <i+1 ; j++) {
                total_1 +=list[i][j];

            }
        }
        for (int i = 0; i <list.length ; i++) {
            for (int j = list[0].length-i-1; j >list[0].length-2-i ; j--) {
                total_2 +=list[i][j];

            }
        }
        return Math.max(total_1,total_2);

    }
}
