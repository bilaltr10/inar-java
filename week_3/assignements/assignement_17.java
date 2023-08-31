package week_3.assignements;

import java.lang.*;
import java.util.*;
//) Write a program that plays the popular scissor-rockpaper
//game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
//The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
//The program prompts the user to enter a number 0, 1, or 2 and displays a message
//indicating whether the user or the computer wins, loses, or draws. Here are sample runs:

public class assignement_17 {
    public static void main(String[] args) {
        String exit = "exit";
        int scoreOfComputer = 0;
        int scoreOfUser = 0;

        do {
            Scanner bilal = new Scanner(System.in);
            System.out.println("Welcome the famous game of scissor-rockpaper\nchoose one of them\n0-Scissor 1-Rock 2-Paper");
            int user = bilal.nextInt();
            int computer = (int) (Math.random() * 3);

            do {
                if ((user < 0 || user > 2)) {
                    System.out.println("Yanlış değer girdiniz Lütfen Tekrar giriniz 0-Scissor 1-Rock 2-Paper");
                    user = bilal.nextInt();
                }
            }while ((user < 0 || user > 2));


            System.out.print("The computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor. ");
                    break;
                case 1:
                    System.out.print("rock. ");
                    break;
                case 2:
                    System.out.print("paper. ");
                    break;
            }


            System.out.print("You are ");

            switch (user) {
                case 0:
                    System.out.print("scissor ");
                    break;
                case 1:
                    System.out.print("rock ");
                    break;
                case 2:
                    System.out.print("paper ");
                    break;
            }

            if (user == computer) {
                System.out.println("too . It is a draw");
            }
            else {
                boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 2) || (user == 1 && computer == 0);
                if (win) {
                    System.out.println(". You won ");
                    scoreOfUser++;
                } else {
                    System.out.println(". You lost");
                    scoreOfComputer++;
                }
            }

            System.out.println("Score is you: " + scoreOfUser + " computer :" + scoreOfComputer);
            System.out.println("Type yes to continue ");
            exit = bilal.next();

        } while (exit.equals("yes"));
        System.out.println("It was a good game");
    }
}
