package week_12.Q_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class revisedHangman {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<String> array = words();
        System.out.println(array);
        char check;
        do {

            check = hangMan(array.get((int) (Math.random() * array.size())));

        } while (check == 'y');
    }

    public static ArrayList<String> words() {
        ArrayList<String> list = new ArrayList<>();
String sourcePath = "C:/Users/HP/workspace/inar-java/src/week_12/Q_17/hangman_Vocabulary_List.txt";
        try (
                Scanner scanner = new Scanner(new File(sourcePath))

        ) {
            while (scanner.hasNext()) {

                list.add(scanner.next());


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    public static char hangMan(String str) {
        int missedCount = 0;
        int count ;
        char word;
        int isThere;


        char[] array = new char[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
        }
        char[] hang = new char[str.length()];
        Arrays.fill(hang, '*');

        do {
            count = 0;
            isThere = 0;

            do {
                System.out.print("(Guess) Enter a letter in word ");
                for (char a : hang) {
                    System.out.print(a);
                }
                System.out.println(" >");
                word = input.next().toLowerCase().charAt(0);

                for (int i = 0; i < str.length(); i++) {
                    if (word == array[i]) {
                        count++;
                    }
                }
                if (count == 0) missedCount++;


            } while (count == 0);

            for (int i = 0; i < array.length; i++) {
                if (word == hang[i]) {
                    isThere++;
                }


            }
            if (!(isThere > 0)) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == word) {
                        hang[i] = word;

                    }
                }
            } else {
                System.out.println(word + " is already in the word");
            }


        } while (!(Arrays.equals(array, hang)));


        System.out.print("The word is " + str);
        System.out.println(" You missed " + missedCount + " " + (missedCount > 1 ? "times" : "time"));


        System.out.println("Do you want to guess another word ? Enter y or n");
        char yesOrNo = input.next().charAt(0);

        if (yesOrNo == 'y') return 'y';
        else return 'n';
    }
}

