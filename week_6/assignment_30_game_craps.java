package week_6;

import java.util.Scanner;
//Twin primes are a pair of prime numbers that differ by 2. For example,
//3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
//Write a program to �nd all twin primes less than 1,000. Display the output as follows
public class assignment_30_game_craps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstDice = randomDice();
        int secondDice = randomDice();

        showTwodices(firstDice, secondDice);
        conditions(firstDice, secondDice);
    }

    public static int randomDice() {

        return (int) (Math.random() * 6) + 1;

    }

    public static void showTwodices(int dice1, int dice2) {

        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));

    }

    public static void conditions(int dice1, int dice2) {

        int total = dice2 + dice1;

        if (total == 7 || total == 11) {
            conditionOfWin();
        } else if (total == 2 || total == 3 || total == 12) {
            conditionOfLose();

        } else {
            conditionOfNewChance(total);

        }
    }

    public static void conditionOfWin() {
        System.out.println("You win ");

    }

    public static void conditionOfLose() {
        System.out.println("You lose ");

    }

    public static void conditionOfNewChance(int total) {

        int dice1;
        int dice2;
        do {

            dice1 = randomDice();
            dice2 = randomDice();
            System.out.print("Newly ");
            showTwodices(dice1, dice2);

            if (dice2 + dice1 == total) {
                conditionOfWin();
                break;
            } else if (dice2 + dice1 == 7) {
                conditionOfLose();
                break;
            }


        } while (!(dice2 + dice1 == total || dice2 + dice1 == 7));


    }
}
