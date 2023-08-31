package week_4.assignements;
import java.util.*;
//(Convert letter grade to number) Write a program that prompts the user to enter a letter
//grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2, 1, or 0. Here is a
//sample run:
public class assignement_14_Letter_For_Number {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        System.out.println("Enter a letter grade ");
        String letterGrade = bilal.next();
        String newLetterGrade = null;

        if(!(letterGrade.equals("A")||letterGrade.equals("B")||letterGrade.equals("C")
                ||letterGrade.equals("D")||letterGrade.equals("E")||letterGrade.equals("F")))
        {
            System.out.printf("%s is an invalid grade ", letterGrade);
        }
        else{
        switch (letterGrade) {

            case "A":
                newLetterGrade = "4";
                break;
            case "B":
                newLetterGrade = "3";
                break;
            case "C":
                newLetterGrade = "2";
                break;
            case "D":
                newLetterGrade = "1";
                break;
            case "F":
                newLetterGrade = "0";
                break;
        }
            System.out.printf("The numeric value for grade %s is %s",letterGrade,newLetterGrade);
        }


    }
}
