package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_12_reverseArray {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = makeAnArray();


        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();

        reverseArray(array); //Metodun içinde reverse ettiğin array değişiklik gösteriyor
        //for each le doğrudan array yazdım dikkat

        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static int[] makeAnArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 10;
        }
        return array;
    }

    public static void reverseArray(int[] array) {

        int temp;
        for (int i = 0, indis = array.length - 1; i < array.length / 2; i++, indis--) {
            temp = array[i];
            array[i] = array[indis];
            array[indis] = temp;
        }//eğer i yi dizi.length a kadar götürürsem şu hata :  mesala değiştirmeye başladık 10 9 8 7 6 6 7 8 9 10 çıktısı verdi

    }
}
