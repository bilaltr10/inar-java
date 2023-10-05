package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_13_generateNumber_some_Exceptions {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Enter ten numbers to exclude from random (1-54): ");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*54)+1;
        }
        for (int a :array) {
            System.out.print(a+"  ");
        }
        System.out.println();
        getRandom(array);
    }


    public static int getRandom(int... numbers) {
        boolean isTrue ;

        int random;
        do {
            isTrue= false;
            random = (int) (Math.random() * 53) + 1;
            System.out.println("Number generated :  "+random);
            for (int i = 0; i < numbers.length; i++) {
                if (random == numbers[i]) {
                    isTrue = true;

                }
            }


        } while (isTrue);


  return random;  }

}
