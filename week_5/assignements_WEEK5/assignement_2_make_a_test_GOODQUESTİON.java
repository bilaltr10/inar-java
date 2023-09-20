package week_5.assignements_WEEK5;
import java.lang.*;
import java.util.Scanner;
//
/*     (Repeat additions) Listing 5.4, SubtractionQuizLoop.java, generates five random
 *      subtraction questions. Revise the program to generate ten random addition questions
 *      for two integers between 1 and 15. Display the correct count and test time.
 **/


public class assignement_2_make_a_test_GOODQUESTİON {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter_true = 0;
        int counter_false = 0;
        int counter = 1;
        int answer;
        double number_of_net = 0;
        double score_of_student = 0;
        int counter_of_chance = 2;
        long time_of_start = System.currentTimeMillis();


        System.out.print("How many Q's you want to solve : ");
        int number_of_questions = input.nextInt();
        double point_of_every_question = 100.0 / number_of_questions;



        while (counter <= number_of_questions) {
            int number_1 = (int) (Math.random() * 16);
            int number_2 = (int) (Math.random() * 16);
            System.out.print((counter) + "/" + number_of_questions + "----> What is " + number_1 + " + " + number_2 + "=");
            answer = input.nextInt();
            if (number_1 + number_2 == answer) {

                counter_true++;
            } else {
                while ((number_1 + number_2 != answer) && counter_of_chance <= 3) {
                    System.out.println("You are wrong. Your " + (counter_of_chance) + " .  chance :  ");
                    System.out.print((counter) + "/" + number_of_questions + "----> What is " + number_1 + " + " + number_2 + "=");
                    answer = input.nextInt();
                    counter_of_chance++;

                }
                if (counter_of_chance <= 4) {
                    System.out.println("You are wrong! Answer should be " + (number_1 + number_2));
                }

                counter_false++;

            }
            counter_of_chance = 2;
            counter++;
            System.out.println();
        }

        long endTime = System.currentTimeMillis();


        number_of_net = counter_true - (counter_false / 4.0);
        score_of_student = point_of_every_question * number_of_net;

        System.out.println("Number of Q's asked to you : " + number_of_questions);
        System.out.println("Number of true answers : " + counter_true);
        System.out.println("Number of false answers : " + counter_false);
        System.out.println("Your net is : " + number_of_net);
        System.out.println("The score you got : " + score_of_student);
        System.out.println("The test of "+ number_of_questions+ " questions last "+ ((endTime-time_of_start)/1000)+" seconds.");

    }
}
