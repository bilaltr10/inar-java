package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Perfect number) A positive integer is called a perfect number if it is equal to the sum of all
//of its positive divisors, excluding itself. For example, 6 is the �rst perfect number because
//6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less than
//10,000. Write a program to �nd all these four numbers
public class assignement_33_check_input_is_prefect_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int checkUntilThisNumber = input.nextInt();
        int factorOfGivenNumber = 2;
        int total = 0;

        while (factorOfGivenNumber < checkUntilThisNumber) {

            if (checkUntilThisNumber % factorOfGivenNumber == 0) {

                total += factorOfGivenNumber;


            }
factorOfGivenNumber++;

        }

        total++;

if (total==checkUntilThisNumber )
{
    System.out.print("It is perfect number");
}
else {
    System.out.print("It is not perfect number");
}

    }
}
