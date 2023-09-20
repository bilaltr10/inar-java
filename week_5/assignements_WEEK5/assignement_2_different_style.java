package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_2_different_style {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int answer;
        System.out.println("How many Q's you want to solve : ");
        int number_of_questions = input.nextInt();


        while (counter <= number_of_questions) {
            int number_1 = (int) (Math.random() * 16);
            int number_2 = (int) (Math.random() * 16);
            System.out.print((counter) + "/" + number_of_questions + "----> What is " + number_1 + " + " + number_2 + "=");
            answer = input.nextInt();
            if (number_1 + number_2 == answer) {
            }
            else {
                while (number_1 + number_2 != answer){
                    System.out.print((counter) + "/" + number_of_questions + "----> What is " + number_1 + " + " + number_2 + "=");
                    answer = input.nextInt();
                }
            }
            System.out.println("You are right. ");
            counter++;
        }
    }
}
