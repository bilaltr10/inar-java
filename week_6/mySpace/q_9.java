package week_6.mySpace;

import java.util.Locale;
import java.util.Scanner;

//Develop a Java program to segment a given string into valid words using a word dictionary.
// Return the possible  word segments, or indicate if segmentation is not possible.
public class q_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] array = new String[]{"Naber", "Selam", "Hoşgeldin", "Merhaba", "Gidiyorum", "Evet", "Nasılsın"};


        String str = input.next().toLowerCase(Locale.ROOT);
        int count = 0;
        String[] arr = new String[0];
       int g =0;
       int h =0 ;
        for (int i = 0; i < array.length; i++) {
          count=0;
            for (int j = 0; j < str.length(); j++) {
                if ((array[i].contains(Character.toString(str.charAt(j))))) ;
                count++;
            }

            if (count <= str.length()) ;
            g++;
            arr = new String[g];
            arr[h] = array[i];
            h++;
        }
        for (String a : arr) {
            System.out.println(a + " ");
        }
    }
}
