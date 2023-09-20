package week_5._my_field;

import java.util.*;


public class how_many_times_find_letter_intext {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);


        String text = "Remember that the key to mastering string manipulation is practice." +
                " These questions cover a wide range of scenarios, helping you strengthen your skills and" +
                " problem-solving abilities. " +
                "Experiment, code, and test your solutions thoroughly.";


        char[] array = new char[text.length()-1];
        array = text.toCharArray();
        int i = 0;
        int sayaç = 0;
        System.out.println("Bir harf gir ");
        char a = input.next().charAt(0);

        do {
            if (a == array[i]) {
                sayaç++;
            }
            i++;

        } while (i <= array.length - 1);
        if (sayaç == 0) {
            System.out.println("Girdiğiniz harf metinde yoktur.");
        } else {
            System.out.println("Giridğiniz harf metinde " + sayaç + " adet vardır . ");
        }
    }
}
