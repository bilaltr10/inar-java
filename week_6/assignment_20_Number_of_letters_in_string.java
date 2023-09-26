package week_6;

import java.util.Scanner;

public class assignment_20_Number_of_letters_in_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string to learn its number of letters");
        String stringUserEntered = input.nextLine();

        if(countLetters(stringUserEntered)>0){
            System.out.printf("%s %c%s%c %c %d","The number of letters in the string",'"',stringUserEntered,
            '"',':',countLetters(stringUserEntered));
        }

    }

    public static int countLetters(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i <= s.length()-1; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;

    }
}
