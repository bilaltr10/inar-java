package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Find the highest score) Write a program that prompts the user to enter the number of
//students and each student’s name and score, and �nally displays the name of the student
//with the highest score
public class assignement_8_highest_score_student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number_of_students = input.nextInt();
        String big_name = "";
        double biggest_number = 0;
        int m = 1;
        String name = "";
        double score = 0;

        do {
            System.out.print("Student :" + m + "\n");
            System.out.print("Name: ");
            name = input.next();
            System.out.print("Score:");
            score = input.nextDouble();
            m++;
            if (score > biggest_number) {
                biggest_number = score;
                big_name = name;
            }

        } while (m <= number_of_students);
        System.out.println("Student with the highest score is " + big_name.toUpperCase() + ": " + biggest_number + " points");


    }
}

