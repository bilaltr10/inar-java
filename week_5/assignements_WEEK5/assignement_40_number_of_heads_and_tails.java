package week_5.assignements_WEEK5;

import java.util.Scanner;

//Write a program that simulates �ipping a coin one million times
//and displays the number of heads and tails.
public class assignement_40_number_of_heads_and_tails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int number = 0;
        int numberOfHeads = 0;
        int numberOfTails = 0;

        while (i <= 1000000) {

            number = (int) (Math.random() * 2);

            if (number == 0) {
                numberOfHeads++;
            } else {
                numberOfTails++;
            }

            i++;


        }

        System.out.println("Number of Heads = "+ numberOfHeads);
        System.out.println("Number of Tails = "+numberOfTails);

    }
}
