package week_3.assignements;

import java.util.*;
//Write a program that randomly generates a lottery of a three-digit number, prompts the
//user to enter a three-digit number, and determines whether the user wins according to the
//following rules:
//1. If the user input matches the lottery number in the exact order, the award is $10,000.
//2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
//3. If one digit in the user input matches a digit in the lottery number, the award is $1,000

public class assignement_15 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        int lotteryNumber = (int) (Math.random() * 1000);

        System.out.println("Please enter a 3-digits number for your chance ");
        int guessedNumber = bilal.nextInt();


        int digit1OfLotteryNumber = lotteryNumber / 100;
        int remain = lotteryNumber % 100;
        int digit2OfLotteryNumber = remain / 10;
        int digit3OfLotteryNumber = remain %= 10;

        int digit1OfGuessedNumber = guessedNumber / 100;
        int remainOfGueesedNumber  = guessedNumber % 100;
        int digit2OfGuessedNumber = remainOfGueesedNumber / 10;
        int digit3OfGuessedNumber = remainOfGueesedNumber %= 10;

        if (lotteryNumber == guessedNumber) System.out.println(" you won 10.000$  ");
        else if ( (digit1OfGuessedNumber == digit1OfLotteryNumber || digit1OfGuessedNumber == digit2OfGuessedNumber || digit1OfGuessedNumber==digit3OfLotteryNumber)&&
                (digit2OfGuessedNumber==digit1OfLotteryNumber || digit2OfGuessedNumber== digit2OfLotteryNumber || digit2OfGuessedNumber == digit3OfLotteryNumber)&&
                (digit3OfGuessedNumber == digit1OfLotteryNumber || digit3OfGuessedNumber==digit2OfLotteryNumber || digit3OfGuessedNumber == digit3OfLotteryNumber)){
            System.out.println("You won 3.000$ it was " + lotteryNumber);
        }
        else if ( (digit1OfGuessedNumber == digit1OfLotteryNumber || digit1OfGuessedNumber == digit2OfGuessedNumber || digit1OfGuessedNumber==digit3OfLotteryNumber)||
                (digit2OfGuessedNumber==digit1OfLotteryNumber || digit2OfGuessedNumber== digit2OfLotteryNumber || digit2OfGuessedNumber == digit3OfLotteryNumber)||
                digit3OfGuessedNumber == digit1OfLotteryNumber || digit3OfGuessedNumber==digit2OfLotteryNumber || digit3OfGuessedNumber == digit3OfLotteryNumber){

                System.out.println("You won 1.000$ it was " +lotteryNumber);
            }
        else System.out.println("sorry no match it was "+ lotteryNumber);
    }
}
