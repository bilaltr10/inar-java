package week_6;

import java.util.Scanner;
//Revise Question_06_30 to run it 10,000 times and display
//the number of winning games
public class assignment_32_chance_of_winning_at_craps {

    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10000; i++) {
            int firstDice = randomDice();
            int secondDice = randomDice();
            conditions(firstDice, secondDice);
        }
        System.out.println("Number of Winning games : " + count);
    }

    public static int randomDice() {

        return (int) (Math.random() * 6) + 1;

    }



    public static void conditions(int dice1, int dice2) {

        int total = dice2 + dice1;

        if (total == 7 || total == 11) {
            conditionOfWin();
        } else if (total == 2 || total == 3 || total == 12) {

        } else {
            conditionOfNewChance(total);

        }
    }

    public static int conditionOfWin() {
        count++;
        return count;

    }


    public static void conditionOfNewChance(int total) {

        int dice1;
        int dice2;
        do {

            dice1 = randomDice();
            dice2 = randomDice();
            // System.out.print("Newly ");
            // showTwodices(dice1, dice2);

            if (dice2 + dice1 == total) {
                conditionOfWin();
                break;
            }


        } while (!(dice2 + dice1 == total || dice2 + dice1 == 7));


    }
}
