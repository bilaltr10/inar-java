package week_5.assignements_WEEK5;

import java.util.Scanner;

//* Chapter 5 Exercise 1:
// *
// *      (Count positive and negative numbers and compute the average of numbers)
// *      Write a program that reads an unspecified number of integers, determines how many
// *      positive and negative values have been read, and computes the total and average
// *      of the input values (not counting zeros). Your program ends with the input 0. Display
// *      the average as a floating-point number.
public class assignement_1_enter_numbers_for_concatination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String show_the_number_entered = "";
        int count_positive = 0;
        int count_negative = 0;
        double average_of_number = 0;
        int total_of_numbers = 0;
        int number_user_entered = 0;
        //   System.out.println("How many numbers will you enter : ");
        //int number_of_input_number = input.nextInt();
        //   for (int i = 0; i <= number_of_input_number - 1; i++) {
        int at_which_number_we_are = 1;

        System.out.println("Enter the number you like for concatination but program stops if you enter 0 ");


        for (int i = -1; i != 0; ) {
            System.out.println((at_which_number_we_are) + ". sayıyı gir ");
            number_user_entered = input.nextInt();

            if (number_user_entered > 0) {
                count_positive++;
            } else if (number_user_entered < 0) {
                count_negative++;

            } else {
                break;
            }
            total_of_numbers += number_user_entered;
            at_which_number_we_are++;
            show_the_number_entered += number_user_entered + " ";
        }

if ( at_which_number_we_are==1 && number_user_entered==0){
    System.out.println("No number is entered except 0");
}
else {
    System.out.println("User entered these number : " + show_the_number_entered);
    average_of_number = total_of_numbers / ((count_negative + count_positive) * 1.0);
    System.out.println("User entered " + (count_negative + count_positive) + " numbers");
    System.out.println("Number of positive number : " + count_positive + "/" + (at_which_number_we_are - 1));
    System.out.println("Number of negative number : " + count_negative + "/" + (at_which_number_we_are - 1));
    System.out.println("Total of numbers : " + total_of_numbers);
    System.out.println("Average of numbers : " + average_of_number);

}

    }
}
