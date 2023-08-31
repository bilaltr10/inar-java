package week_3.assignements;

import java.util.*;

//Write a program that simulates picking a card from a deck
//of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
//Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
//Here is a sample run of the program
public class assignement_24 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
int i =0 ;
int m=0 ;
        String[] array1 = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] array2 = new String[]{"Clubs", "Diamond", "Hearts", "Spades"};
        System.out.println("kaç tane kart istiyorsunuz");
        int kartSayısı = bilal.nextInt();
      for ( int x =1 ; x<=kartSayısı ; x++) { // bir çok kart
             i = (int) (Math.random() * 13);
             m = (int) (Math.random() * 4);
          System.out.println(x+ " . card  you picked is " + array1[i] + " of " + array2[m]);

      }

       /* System.out.println("Enter a number [0,12] ");
         i = bilal.nextInt();
        System.out.println("enter a number [0,3] ");
        m = bilal.nextInt();

        if (i > array1.length || m > array2.length)
            System.out.println("hatalı bir değer girdiniz ");
        else
            System.out.println("The card you picked is " + array1[i] + " of " + array2[m]);*/
    }
}
