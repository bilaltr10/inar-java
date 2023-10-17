package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first matrix length: ");
        int matrixOneRow = input.nextInt();
        int matrixOneColumn = input.nextInt();
        System.out.println("Enter second Matrix length: ");
        int matrixTwoRow = input.nextInt();
        int matrixTwoColumn = input.nextInt();


        if (matrixOneColumn == matrixTwoColumn && matrixOneRow == matrixTwoRow) {
            int[][] matrix1 = new int[matrixOneRow][matrixOneColumn];
            int[][] matrix2 = new int[matrixTwoRow][matrixTwoColumn];

            assignment_4.putTheValues(matrix1);
            assignment_4.putTheValues(matrix2);
            writeTheArray(matrix1, matrix2);

        }
    }

    public static void writeTheArray(int[][] matrix1, int[][] matrix2) {

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.printf("%-5d", matrix1[i][j]);
            }

            System.out.print("    ");
            if (i == matrix1.length / 2) {

                System.out.printf("%s/b ", "+");
            }
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.printf("%-5d", matrix2[i][j]);

            }
            System.out.print("    ");
            if (i == matrix1.length / 2) {
                System.out.printf("%s/b ", "=");
            }
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.printf("%-5d ", matrix1[i][j] + matrix2[i][j]);

            }

            System.out.println();
        }

    }


}

