package week_9_object.MyField;

import java.util.Scanner;

public class testOf_MetodluClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MetodluClass metodluClass = new MetodluClass(6);
        System.out.println(metodluClass.faktoriyelHesapla());
        metodluClass.sayiArtir(5);
        System.out.println(metodluClass.getSayi());
        metodluClass.sayiSifirla();
        System.out.println(metodluClass.kareHesapla());
    }
}
