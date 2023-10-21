package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_19 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] list = makeTheArray();
        fillTheList(list);
        showTheList(list);


        System.out.println("Matrix has" + (!isConsecutiveFour(list) ? " not " : "") + " consecutive four number");

    }


    public static int[][] makeTheArray() {
        System.out.println("Enter the number of row or column");
        int column = input.nextInt();
        int row = input.nextInt();
        int[][] list = new int[row][column];
        return list;

    }

    public static void fillTheList(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = (int) (Math.random() * 5);
            }
        }
    }

    public static void showTheList(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean isConsecutiveFour(int[][] list) {
        return (isConsecutiveFourRow(list) || isConsecutiveFourColumn(list) || isConsecutiveFourDiagonal(list));
    }

    public static boolean isConsecutiveFourRow(int[][] list) {
        if (list[0].length < 3) return false;
        int count;
        for (int i = 0; i < list.length; i++) {
            count = 1;
            for (int j = 0; j < list[0].length - 1; j++) {
                if (list[i][j] == list[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 0 && j == list[0].length - 3) {
                    break;
                }
            }
            if (count == 4) return true;
        }

        return false;
    }

    public static boolean isConsecutiveFourColumn(int[][] list) {
        if (list.length < 3) return false;
        int count;
        for (int j = 0; j < list[0].length; j++) {
            count = 1;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i][j] == list[i + 1][j]) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == 0 && j == list.length - 3) {
                    break;
                }
            }
            if (count == 4) return true;
        }
        return false;
    }


    public static boolean isConsecutiveFourDiagonal(int[][] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if ( sendTheArrayForMajorDiagonal(list, i, j) || sendTheArrayForSubDiagonal(list, i, j));
                return true;
            }

        }
        return false;
    }

    public static boolean sendTheArrayForMajorDiagonal(int[][] list, int i, int j) {

        if (i >= list.length - 3) {
            return false;
        }
        if (j >= list[0].length - 3) {
            return false;
        }
        int number = list[i][j];
        int count = 1;
        for (int k = 0; k < 4; k++) {
            if (number == list[i + k][j + k]) {
                count++;

            }
        }
        if (count == 4) {
            return true;
        } else return false;


    }

    public static boolean sendTheArrayForSubDiagonal(int[][] list, int i, int j) {

        if (i >= list.length-3) {
            return false;
        }
        if (j <3) {
            return false;
        }
        int number = list[i][j];
        int count = 1;
        for (int k = 0; k < 4; k++) {
            if (number == list[i + k][j - k]) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else {
            return false;

        }


    }

}


