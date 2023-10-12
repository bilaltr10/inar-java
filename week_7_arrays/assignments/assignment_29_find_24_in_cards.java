package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_29_find_24_in_cards {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int total = 0;
        int[] chosenCards = new int[4];
        int pick = 0;
        String chosenCardsString ="";

        String[] list = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        while (total != 24) {
           total =0;
            for (int i = 0; i < 4; i++) {
                int number = (int) (Math.random() * list.length);
                total += number;
                chosenCards[i] = number;
            }
            pick++;
        }

        for (int i = 0; i < chosenCards.length; i++) {
            chosenCardsString += list[chosenCards[i]-1]+" ";
        }

        System.out.println("The number of picks that yields sum of 24 :"+ pick + " Cards : " +chosenCardsString);

    }

}
