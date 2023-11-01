package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_34 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double[][] list = askTheUser();
        fillTheList(list);
         double [] rightmostLowestPoint=getRightmostLowestPoint(list);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)",rightmostLowestPoint[0],rightmostLowestPoint[1]);
    }
    public static double [][] askTheUser(){
        System.out.println("How many points will be entered? ");
        int numberOfPoints = input.nextInt();
        System.out.println("Enter "+numberOfPoints+ " points");
        return new double[numberOfPoints][2];
    }
    public static void fillTheList(double [][] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextDouble();
            }
        }
    }

    public static double[] getRightmostLowestPoint(double [][] list){
double[] m = new double[2];
double min = list[0][1];
        for (int i = 0; i < 1; i++) {
            for (int j = i+1; j <list.length-1 ; j++) {

                if ( list[j][1] <=min ) {
                    min = list[j][1];
                    m[0] = list[j][0];
                    m[1] = min;
                }
                else if (list[j][1] == min) {
                        m[0] =Math.max(list[j][1],m[0]);
                    }

                }
            }


return m;

    }

}
