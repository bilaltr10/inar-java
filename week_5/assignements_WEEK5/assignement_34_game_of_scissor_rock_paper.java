package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper
//game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
//The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
//The program prompts the user to enter a number 0, 1, or 2 and displays a message
//indicating whether the user or the computer wins, loses, or draws.Let the user
//continuously play until either the user or the computer wins more than two times than its
//opponent
public class assignement_34_game_of_scissor_rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int scoreOfPc = 0;
        int scoreOfUser = 0;

        while (!(scoreOfUser == 3 || scoreOfPc == 3)) {

            System.out.print("Enter 0 - Scissor  1- Rock  2- Paper ");
            int numberOfUser = input.nextInt();

            System.out.print("You : ");

            switch (numberOfUser) {

                case 0:
                    System.out.print("Scissor.");
                    break;

                case 1:
                    System.out.print("Rock");
                    break;
                case 2:
                    System.out.print("Paper");
                    break;

            }



            System.out.print("   PC : ");

            int numbersGivenByPc = (int) (Math.random() * 3);

            switch (numbersGivenByPc) {
                case 0:
                    System.out.print("Scissor ");
                    break;
                case 1:
                    System.out.print("Rock ");
                    break;
                case 2:
                    System.out.print("Paper ");
                    break;
            }


            if (numberOfUser == numbersGivenByPc) {
                System.out.println(" It is a draw");
            }
            else {
                boolean win = (numberOfUser == 0 && numbersGivenByPc == 2) || (numberOfUser == 1 && numbersGivenByPc == 2) || (numberOfUser == 1 && numbersGivenByPc == 0);
                if (win) {
                    System.out.println(". You won ");
                    scoreOfUser++;
                } else {
                    System.out.println(". You lost");
                    scoreOfPc++;
                }
            }

            System.out.println("PC : "+scoreOfPc + "\nYOU : "+scoreOfUser);
        }
    }

}
