package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_16 {
    static Scanner input = new Scanner(System.in);
// {1,1} kayboluyor ???
    public static void main(String[] args) {

        int[][] list = new int[][]{{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        sortTwoDimensinalArrayForFirst(list);
        sortTwoDimensinalArrayForSecond(list);
        showTheArray(list);

    }

    public static void sortTwoDimensinalArrayForFirst(int[][] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length-1  ; j++) {
                if (list[j][0] > list[j + 1][0]) {
                    int temp = list[j][0];
                    list[j][0] = list[j + 1][0];
                    list[j + 1][0] = temp;
                }}}}

    public static void showTheArray(int[][] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {

                System.out.print(list[i][j] + " ");
            }
            System.out.println();}}



    public static void sortTwoDimensinalArrayForSecond(int[][] list) {

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length -1 - i; j++) {
                if (list[j][0] == list[j + 1][0]) {
                    if (list[j][1] > list[j + 1][1]) {
                        int temp = list[j][1];
                        list[j][1] = list[j + 1][1];
                        list[j + 1][1] = temp;

                    }}}}}


}
