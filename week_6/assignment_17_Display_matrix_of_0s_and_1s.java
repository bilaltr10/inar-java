package week_6;

import java.util.Scanner;

public class assignment_17_Display_matrix_of_0s_and_1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  'n' (for n-by-n matrix) :  ");
        int nforMatrix = input.nextInt();

        printMatrix(nforMatrix);

    }
    public static void printMatrix(int n){
        int count =0;

        for (int i =0 ; i<n ; i++){
                for (int m =0 ; m<n; m++){
                    System.out.print((int)(Math.random()*2)+" ");
                }
            System.out.println();
        }


    }
}
