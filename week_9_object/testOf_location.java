package week_9_object;

import java.util.Scanner;

public class testOf_location {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and column in the array");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] list = new double[row][column];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] =(int) (Math.random()*10);
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }

Location.locateLargest(list);
        System.out.printf("The location of largest element is %.1f  at (%d, %d )  ", Location.maxValue,Location.row,Location.column);

    }
}
