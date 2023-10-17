package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int a = entarance();
        int[][] list = makeTheList(a);
        double distance = findTheDistance(list);
        pointsMinDistance(list, distance);
        System.out.println("Their distance is " + distance);

    }

    public static int entarance() {
        System.out.print("Enter the number of points : ");
        return input.nextInt();
    }

    public static int[][] makeTheList(int number) {
        int[][] list = new int[number][2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextInt();
                System.out.print(list[i][j] + " ");
            }
        }
        return list;
    }

    public static double findTheDistance(int[][] list) {
        double distance;
        double minDistance = 1000;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                distance = Math.sqrt(Math.pow(list[i][0] - list[j][0], 2) + Math.pow(list[i][1] - list[j][1], 2));
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }
        return minDistance;
    }

    public static void pointsMinDistance(int[][] list, double value) {
        double distance;
        int[][] array;

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                distance = Math.sqrt(Math.pow(list[i][0] - list[j][0], 2) + Math.pow(list[i][1] - list[j][1], 2));
                if (distance == value) {
                    System.out.printf("The closest two points are ( %d , %d ) and (%d , %d) %n", list[i][0], list[i][1], list[j][0], list[j][1]);
                }

            }
        }
    }
}
