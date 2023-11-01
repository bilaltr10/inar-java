package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_23 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter 6-by-6 matrix filled with 0s and 1s");
        int[][] list = new int[6][6];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextInt();
            }
        }
        int[] flippedCell = findTheFlip(list);
        System.out.printf("The flipped cell is at (%d , %d)", flippedCell[0], flippedCell[1]);
    }

    public static int[] findTheFlip(int[][] array) {
        int[] list = new int[2];
        list[0] = checkTheRow(array);
        list[1] = checkTheColumn(array);
        return list;
    }
    public static int checkTheRow(int[][] list) {

        int total;
        for (int i = 0; i < list.length; i++) {
            total = 0;
            for (int j = 0; j < list[0].length; j++) {
                total += list[i][j];

            }
            if (total % 2 != 0) {
                return i;
            }
        }
        return -1;


    }

    public static int checkTheColumn(int[][] list) {
        int total;
        for (int i = 0; i < list[0].length; i++) {
            total = 0;
            for (int j = 0; j < list.length; j++) {
                total += list[j][i];

            }
            if (total % 2 != 0) {
                return i;
            }
        }
        return -1;


    }
}