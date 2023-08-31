package week_2.denemeler;

import java.util.Scanner;
public class loops_7 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner((System.in));
        int deger = bilal.nextInt();
        int bolen = 1;
        int tamBolenlerToplami = 0;
        while(bolen <= deger) {
            if(deger%bolen == 0) {
                System.out.println(deger+" sayısı "+bolen+" sayısına tam bölünür.");
                tamBolenlerToplami = tamBolenlerToplami+bolen;
            }
            bolen++;
        }
        System.out.println("\n"+deger+" sayısının tam bölenlerinin toplamı: "+tamBolenlerToplami);
if ( tamBolenlerToplami == deger+1 ) System.out.println("sayı bir asal sayıdır");
    }
}
