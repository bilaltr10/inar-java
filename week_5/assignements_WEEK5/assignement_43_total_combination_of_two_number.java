package week_5.assignements_WEEK5;

import java.util.Scanner;

//Write a program that displays all possible combinations for picking
//two numbers from integers 1 to 7. Also display the total number of all combinations
public class assignement_43_total_combination_of_two_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int startingValue = 1;
        int endingValue = 7;
        for (int i = 1; i <= 7; i++) {
            while (startingValue <= 7) {
                System.out.println(i + " " + (startingValue));
                startingValue++;
                count++;
            }
            if (startingValue == endingValue+1) {

                startingValue = 1;


            }


        }
        System.out.println("Total number of all combination is "+count);
    }
}
