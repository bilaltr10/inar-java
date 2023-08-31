package week_4.assignements;

import java.util.*;

//
public class assignement_19_ISBN_Number {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        int valueTotalOfFirstNineValue = 0;
        String valuesFromUser = null;
        int integerValueOfUser = 0;
        int[] array = new int[9];
        String[] arrayOfStringValue = new String[10];
        for (int i = 0; i <= 8; i++) {
            System.out.print((i + 1) + ". değeri gir : ");
            valuesFromUser = bilal.next();
            arrayOfStringValue[i] = valuesFromUser;
            integerValueOfUser = Integer.parseInt(valuesFromUser);
            array[i] = integerValueOfUser;
        }

        for (int i = 0; i <= array.length - 1; i++) {

            valueTotalOfFirstNineValue += array[i] * (i+1);

        }
       // System.out.println(valueTotalOfFirstNineValue);

        String valueOf10th = String.valueOf(valueTotalOfFirstNineValue % 11);

        String lastnumber = valueOf10th.equals("0") ? "X" : valueOf10th;

        arrayOfStringValue[arrayOfStringValue.length - 1] = lastnumber;

        for (String x : arrayOfStringValue) {
            System.out.print(x + " ");
        }


    }
}
