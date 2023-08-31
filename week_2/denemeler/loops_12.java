package week_2.denemeler;
import java.util.*;

public class loops_12 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter two numbers");
        int first = bilal.nextInt();
        int second = bilal.nextInt();
        System.out.println(Math.multiplyFull(first,second));// iki sayı çarpım
        System.out.println(Math.floorDiv(first,second));// iki sayıyı böl kalanı aşağıya yuvarla
        System.out.println(Math.floorMod(first,second));// modunu alınıp aşağıya yuvarlıyor
        System.out.println(Math.hypot(5.0,7.0)); //Returns sqrt(x2 +y2) without intermediate overflow or underflow.
        System.out.println(Math.subtractExact(first,second));// ilkinden ikinciyi çıkarma








    }
}
