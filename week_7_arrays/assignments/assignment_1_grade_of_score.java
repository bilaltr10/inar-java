package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_1_grade_of_score {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfStudent = askNunberOfStudent();

        String[] names = new String[numberOfStudent];
        int[] scores = new int[numberOfStudent];

        for (int i = 0; i < numberOfStudent; i++) {

            String name = enterNames(i);
            names[i] = name;
            int score = enterTheScores(i, names[i]);
            scores[i] = score;
        }


        int maxScore = findTheHighestScore(scores);

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-10s %-10s %-10s %d %-10s %c %n","Student names : ", names[i]," Score : ", scores[i] ," Grade : ",findTheGrade(scores[i], maxScore));

        }


    }

    public static int askNunberOfStudent() {
        System.out.println("How many student's score will be entered ?");
        return input.nextInt();

    }

    public static String enterNames(int i) {
        System.out.print("Enter The name of student ");

        return input.next();
    }

    public static int enterTheScores(int i, String name) {
        System.out.print("Enter the score of " + name + " : ");

        return input.nextInt();
    }

    public static int findTheHighestScore(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public static char findTheGrade(int score, int max) {

        if (score >= max - 10) return 'A';
        else if (score >= max - 20) return 'B';
        else if (score >= max - 30) return 'C';
        else if (score >= max - 40) return 'D';
        else return 'F';

    }
}
