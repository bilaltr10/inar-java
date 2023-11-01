package week_8_multiDimensinalArray;

import java.util.Scanner;

public class assignment_25 {
static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter a 3-by-3 matrix row by row");
        double [][] list = makeTheList();
        System.out.println("It is "+(!isMarkovMatrix(list)?"not " : "" )+"a Markov Matrix");


    }
    public static double[][] makeTheList(){
        double [][] list = new double[3][3];
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j <list[0].length ; j++) {
                list[i][j] = input.nextDouble();
            }
        }
        return list;
    }
    public static boolean isMarkovMatrix(double [][] list){
double total ;
        for (int i = 0; i < list[0].length; i++) {
            total =0;
            for (int j = 0; j < list.length; j++) {
                total += list[j][i];
            }
            if(total != 1){
                return false;
            }
        }
        return true;
    }
}
