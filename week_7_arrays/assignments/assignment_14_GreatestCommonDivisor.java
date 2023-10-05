package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_14_GreatestCommonDivisor {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = makeAnArray();
        int gdc = findGdc(array);
        System.out.println("The greatest common divisor : " +gdc);

    }

    public static int[] makeAnArray() {

        int[] array = new int[5];
        System.out.println("Enter 5 number to find their GCD : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+"/"+array.length+ " : ");
            array[i] = input.nextInt();
        }
        return array;
    }

    /*public static int gdc(int[] array) {
        Arrays.sort(array);
        int gdc = 2;
        boolean isTrue = true;

        for (int i = array.length - 1; i > 0; i--) {
            if (!(array[i] % array[0] == 0)) {
                isTrue = false;
                break;

            }
        }
        if (isTrue) {
            return array[0];
        } else {
            gdc = findGdc(array);
        }


        return gdc;
    }*/

    public static int findGdc(int[] array) {
        Arrays.sort(array);
        int count ;
        int gdc =array[0];
        for (int i = gdc; i > 0; i--) {
           count =0;
            for (int j = 0; j < array.length; j++) {
                if ((array[j] % i == 0)) {
                    count++;
            }

                }
            if (count==array.length){
                return i;
            }

        }

   return -1; }


}
// 12 6 8 14 22