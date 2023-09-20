package week_5.assignements_WEEK5;

import java.util.Scanner;

//(Display the ASCII character table) Write a program that prints the characters in the ASCII
//character table from ! to ~. Display ten characters per line. The ASCII table is shown in
//Appendix B. Characters are separated by exactly one space
public class assignement_15_show_chars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        for (int i = 33; i <= 126; i++) {

            System.out.print((char) i + " ");
            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

        }
    }


}
