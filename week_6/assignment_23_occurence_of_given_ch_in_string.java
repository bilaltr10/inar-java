package week_6;

import java.util.Scanner;

public class assignment_23_occurence_of_given_ch_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string :");
        String str = input.nextLine();
        System.out.print("Enter your character to learn its occurrence in your string :");
        char ch = input.next().charAt(0);
        System.out.println(count(str, ch) == 0 ? "'" + str + "'" + " has no " + "'" + ch + "'" + "character " : "'" + str + "'" + " has " +
                (count(str, ch) == 1 ? count(str, ch) + " time "
                        + "'" + ch + "'" + " character " : count(str, ch) + " times " + "'" + ch + "'" + " character "));
    }

    public static int count(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ch) {
                count++;
            }

        }


        return count;

    }
}
