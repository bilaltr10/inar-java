package week_8_multiDimensinalArray;

import java.util.Scanner;

//(Sum elements column by column) Write a method that returns the sum of all the elements
//in a specified column in a matrix using the following header:
public class assignment_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        write("Enter a 3-by-4 matrix row by row :  ");
        double[][] list = new double[3][4];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                write(i, j);
                list[i][j] = input.nextDouble();
            }

        }
        write(list);

    }

    public static void write(String str) {
        System.out.println(str);
    }

       public static void write(int i, int m) {
        System.out.println((i + 1) + "/" + (m + 1) + " ");
    }

    public static void write(double[][] list) {
        double total;
        for (int column = 0; column< list[0].length; column++) {
            total = 0;
            for (int row = 0; row < list.length; row++) {
                total += list[row][column];
            }
            System.out.println("Sum of the elements at the column " + column + " is " + total);
        }
    }


}
