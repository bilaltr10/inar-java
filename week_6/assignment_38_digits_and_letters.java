package week_6;

import java.util.Scanner;
//Write a program that generates random uppercase letters and digits. Your program should
//generate 100 uppercase letters and 100 digit characters, and display them in groups of ten
//characters per line. Accomplish this task using the following methods
public class assignment_38_digits_and_letters {
    static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1 = ' ';
        char ch2 = ' ';
        for (int i = 0; i < 200; i++) {

            System.out.print(getRandomCharacter(ch1, ch2)+ " ");


        }
    }

    public static char getRandomUpperCaseLetter() {

        int x = (int) (Math.random() * 26) + 65;

        return (char) (x);
    }

    public static char getRandomDigitCharacter() {

        int y = ((int) (Math.random() * 9) + 49);

        return (char) (y);
    }

    public static char getRandomCharacter(char ch1, char ch2) {
if (count%10 ==0){
    System.out.println();
}
        if (count < 100) {
            count++;
            return getRandomUpperCaseLetter();
        } else {
            count++;
            return getRandomDigitCharacter();
        }

    }
}
