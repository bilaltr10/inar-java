package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_35_hang_man {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] array = words();
        char check;
        do {

            check=hangMan(array[(int) (Math.random() * array.length)]);

        } while (check == 'y');
    }

    public static String[] words() {
        String[] array = new String[]{"investment", "holiday", "sustainable",
                "military", "software", "summer", "acknowledge", "freezing"
                , "highschool", "advanced"};
        return array;
    }

    public static char hangMan(String str) {
        int missedCount = 0;
        int count = 0;
        char word;
        int isThere;



        char[] array = new char[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
        }
        char[] hang = new char[str.length()];
        for (int i = 0; i < hang.length; i++) {
            hang[i] = '*';
        }

        do {
            count = 0;
            isThere = 0;

            do {
                System.out.print("(Guess) Enter a letter in word ");
                for (char a : hang) {
                    System.out.print(a);
                }
                System.out.println(" >");
                word = input.next().charAt(0);

                for (int i = 0; i < str.length(); i++) {
                    if (word == array[i]) {
                        count++;
                    }
                }
                    if (count == 0) missedCount++;


            } while (count == 0);

            for (int i = 0; i < array.length; i++) {
                if ( word == hang[i]){
                    isThere++;
                }



            }
            if(!(isThere>0)) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == word) {
                        hang[i] = word;

                    }
                }
            }else {
                    System.out.println(word + " is already in the word");
                }



        } while (!(Arrays.equals(array, hang)));


        System.out.print("The word is " + str);
        System.out.println(" You missed " + missedCount + " "+ (missedCount>1 ? "times": "time"));


        System.out.println("Do you want to guess another word ? Enter y or n");
        char yesOrNo = input.next().charAt(0);

        if (yesOrNo == 'y') return 'y';
        else return 'n';
    }
}