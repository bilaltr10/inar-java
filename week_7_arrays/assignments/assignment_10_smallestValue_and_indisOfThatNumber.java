package week_7_arrays.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class assignment_10_smallestValue_and_indisOfThatNumber {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*50);
            System.out.print(array[i]+ " ");
        }
        System.out.println();
//        array= array2;
//        Arrays.sort(array);
//         bunu neden yaptım ? iki aynı array olsun  diğerini sıralıyım
//         indis =0 en küçük olacaktı diğerinde de for döngüsüne sokup eşit olunca break yapıp
//         bulunduğu indisi döndürürüm demiştim ama şunu UNUTTUM  : array ötekine asssign edinc
//         refereanslar bağlandığı için diğeri de değişmiş oluyor.Onun yerine ArrayCopy metodu kullan.


        int[] array2 = new int[array.length];

        System.arraycopy(array, 0, array2, 0, array.length);
        Arrays.sort(array2);
        int count = 0;
        for (int i = 0; i < array2.length ; i++) {
            if (array[i] == array2[0]) {
                count++;
            }

        }



        String placesOfMinumunNUmber = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array2[0]) {
              placesOfMinumunNUmber +=i +" ";
            }
        }

        System.out.print(array2[0]+" is minimum number of this array and in  the indis of "+ placesOfMinumunNUmber);


    }
}