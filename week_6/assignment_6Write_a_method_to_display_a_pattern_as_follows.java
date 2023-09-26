package week_6;

import java.util.Scanner;

public class assignment_6Write_a_method_to_display_a_pattern_as_follows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int numberOfRows= input.nextInt();

        displayPattern(numberOfRows);
    }

    public static void displayPattern(int number){

        for (int i =number ; i>0 ; i--){
            for (int j =i-1 ; j>0 ;j--){
                System.out.print("  ");
            }

            for (int m =number-i+1 ;m>0 ; m-- ){
                System.out.printf("%2d",m);
            }
            System.out.println();
        }




    }
}
