package week_5._my_field;

import java.util.Scanner;

public class is_palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sth ");
        char []array = input.nextLine().toCharArray();
        int sayac = 0;


        for (int m = 0; m <= array.length / 2; m++) {
            if (array[m] != array[array.length - 1 - m]) {
                sayac++;
            }

        }


       if (sayac > 0) {
            System.out.println("palindrom değil");

        } else {
            System.out.println("palindrom");
        }
    }
}
