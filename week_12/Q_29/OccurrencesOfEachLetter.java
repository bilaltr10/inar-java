package week_12.Q_29;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/* Write a program that prompts the user to enter a �le name and
          displays the occurrences of each letter in the �le. Letters are case-insensitive. Here is a
          sample run*/
public class OccurrencesOfEachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCharacters = 0;
        int numberOfScapes = 0;
        int numberOfletters = 0;
        int numberOfNumbers =0;
        int numberOfSigns =0;
        // System.out.println("Enter a file name : ");
        //     String fileName = input.next();
        int[] array = new int[28];
        int[] numberArray = new int[10];
        ArrayList<Character> charr = new ArrayList<>();

        try (
                Scanner scanner = new Scanner(new File("C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_29\\mistik.txt"));

        ) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine().toUpperCase(Locale.ROOT);
                totalCharacters += str.length();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                        int number = str.charAt(i) - 'A';
                        array[number]++;
                        numberOfletters++;

                    }
                   else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        int number = str.charAt(i) - '0';
                        numberArray[number]++;
                        numberOfNumbers++;
                    }
                  else  if(str.charAt(i) == ' '){
                        numberOfScapes++;
                    }
                   else{
                       charr.add(str.charAt(i));
                        numberOfSigns++;
                    }
                }


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number of " + ((char) (i + 'A')) + " 's :" + array[i]);
        }
        System.out.println();
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Number of " + ((char) (i + '0')) + " 's :" + numberArray[i]);
        }
        System.out.println(charr.toString());

        System.out.println("\nTotal characters : " + totalCharacters);
        System.out.println("Number of letters : "+ numberOfletters);
        System.out.println("Number of numbers : "+ numberOfNumbers);
        System.out.println("Number of spaces : "+ numberOfScapes);
        System.out.println("Number of signs :"+ numberOfSigns);
    }
}
