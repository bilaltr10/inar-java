package week_5.assignements_WEEK5;

import java.util.Scanner;

//Write a program that prompts the user to enter the number of
//students and each student’s name and score, and �nally displays the student with the
//highest score and the student with the second-highest score.
public class assignement_9_highest_and_second_highest_score_student_VERYGOODQUESTION {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameSurname = "";
        int numberOfStudents = 0;
        double score = 0;
        double highestScore = 0;
        double secondHighestScore = 0;

        String nameOfHighestStudent = "";
        String nameOfSecondHighest = "";

        System.out.print("Enter the number of students :");
        numberOfStudents = input.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("Student :" + i);
            System.out.println("Name :");
            nameSurname = input.next();
            System.out.println("Score:");
            score = input.nextDouble();




        if (score>highestScore){
            nameOfHighestStudent=nameSurname;
            secondHighestScore=highestScore;
            highestScore=score;
        }
else if (score>secondHighestScore){
    nameOfSecondHighest=nameSurname;
    secondHighestScore=score;

}





        }


        System.out.println("Highest scoring student :" + nameOfHighestStudent);
        System.out.println("The second highest scoring student :" + nameOfSecondHighest);


    }
}
