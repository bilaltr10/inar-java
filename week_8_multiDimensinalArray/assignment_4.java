package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee number: ");
        int numberOfEmployees = input.nextInt();
        int[][] workHours = new int[numberOfEmployees][7];
        int[][] namesAndHours = totalWorkHours(putTheValues(workHours));
        write(namesAndHours);

    }

    public static int[][] putTheValues(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = (int) (Math.random() * 8) + 1;
            }

        }

        return list;
    }

    public static int[][] totalWorkHours(int[][] list) {
        int total;
        int[][] namesAndTotalWorkHours = new int[list.length][2];
        for (int i = 0; i < list.length; i++) {
            total = 0;
            for (int j = 0; j < list[0].length; j++) {
                total += list[i][j];
            }
            namesAndTotalWorkHours[i][0] = i;
            namesAndTotalWorkHours[i][1] = total;
        }
        return namesAndTotalWorkHours;
    }

    public static void write(int[][] list) {

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                int workHour_1 = list[i][1];
                int workHour_2 = list[j][1];
                if (workHour_1 < workHour_2) {
                    int[] temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("Employees and their total hours in decreasing order of the total hours : ");
        for(int[] a :list){
            System.out.println("Employee "+ a[0] +" 's work hour is "+ a[1]);

        }

    }



}
