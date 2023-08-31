package week_3.assignements;

import java.util.*;
//(Game: heads or tails) Write a program that lets the user guess whether the �ip of
//a coin results in heads or tails. The program randomly generates an integer 0 or 1,
//which represents head or tail. The program prompts the user to enter a guess and
//reports whether the guess is correct or incorrect

public class assignement_14 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        byte flip = (byte) ((Math.random() * 2));
        String flipOfCoin = (flip == 1) ? "head " : " tail";

        System.out.println("Guess the flip o coin");
        byte guessOfMe = bilal.nextByte();

        String result = (flip == guessOfMe) ? " Your guess is correct " : " Your guess is incorrect because flip was" + flipOfCoin;
        System.out.println(result);
    }
}
