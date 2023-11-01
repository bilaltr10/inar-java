package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_33_yapılmadı {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4");
        double[][] list = fillTheList();
        makeFourTriangle(list);


    }

    public static double[][] fillTheList() {
        double[][] list = new double[4][2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextDouble();
            }
        }
        return list;
    }

    public static void makeFourTriangle(double[][] list){


    }
}
/*Divide the polygon into four triangles:
Triangle 1: A-B-C
Triangle 2: A-C-D
Triangle 3: A-D-B
Triangle 4: B-C-D

Calculate the equations of the lines for the edges of these triangles.

Find intersection points by comparing line equations.

Check if the intersection points are within the original polygon using a point-in-polygon algorithm.*/