package week_12.Q_3;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 65);
        }

        try {
            System.out.println("Enter the index of the array : ");
            int indis = input.nextInt();
            list[indis] = 2;  // variable ataması daha güzel olamaz mı ?
            System.out.println("You choose : " + indis);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bonds . !!");
        }

    }
}
