package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_35 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] list = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                list[i][j] = input.nextInt();
            }
        }
        int[] place = findTheLargestBlock(list);
        System.out.println(place[0] + " " + place[1]);
    }

    public static int[] findTheLargestBlock(int[][] list) {
        int alan;
        int maxAlan = -1;
        int[] startingPoint = new int[2];
        double[] number = new double[2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                alan = findTheWidth(list, i, j);
                if (alan > maxAlan) {
                    maxAlan = alan;
                    startingPoint[0] = i;
                    startingPoint[1] = j;

                }
            }
        }
        return startingPoint;
    }

    public static int findTheWidth(int[][] list, int i, int j) {
        int count = 1;
        for (int k = i; k < list.length - 1; k++) {
            if (list[i][j] == list[k + 1][j]) {
                count++;
            } else {
                break;
            }
        }
        if (isSquare(list, count, i, j)) {
            return (int) (Math.pow(count, 2));
        }
        return -1;
    }

    public static boolean isSquare(int[][] list, int width, int i, int j) {
        if (i > list.length-2) {
            return false;
        }
        if (j > list[0].length-2) {
            return false;
        }
        for (int k = i; k < i + width; k++) {
            for (int l = j; l < j + width - 1; l++) {
                if (list[k][l] != list[k][l + 1]) {
                    return false;
                }
            }

        }
        return true;
    }


}
