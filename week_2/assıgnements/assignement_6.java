package week_2;
import java.util.*;
//import java.lang.*;

public class assignement_6 {

    public static void main (String [ ]args){
        Scanner bilal = new Scanner(System.in);
        System.out.println("write the number ");
        int sayi = bilal.nextInt();
        String x =String.valueOf(sayi);
        System.out.println(x);
        int uzunluk = x.length();
        System.out.println("sayımız "+uzunluk+" basamaklı bir sayıdır");
       int a =0;

       for ( int i = uzunluk ; 0<=i; i--) {
            a += (int) (sayi / Math.pow(10, i - 1));
            sayi = (int) (sayi % Math.pow(10, i - 1));
       }
       System.out.println("sayının rakamlar toplamı =   "+a);
    }
}
