package week_5.assignements_WEEK5;

import java.util.Scanner;

//) Write a program that reads integers, �nds the largest of
//them, and counts its occurrences. Assume that the input ends with number 0. Suppose that
//you entered 3 5 2 5 5 5 0; the program �nds that the largest is 5 and the occurrence count for
//5 is 4.
public class assignement_41_occurence_of_biggest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int finishLine = 0;

        int max = 0;
        int currenceOfMax = 1;
String numbers ="";
        System.out.print("Enter the first value");
        int inputOfUser = input.nextInt();

        while (inputOfUser != finishLine) {

            inputOfUser = input.nextInt();
numbers +=inputOfUser+ " ";

            if (inputOfUser > max) {
                max = inputOfUser;
                currenceOfMax=1;

            }
            else if (inputOfUser==max){
                currenceOfMax++;
            }

        }

        System.out.println("Enter integers (Ends with 0)");
        System.out.println(numbers);
        System.out.println("The largest count "+max+" and occurence of number is : "+currenceOfMax);

    }
}
