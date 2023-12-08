package myWorkPlace;

import week_9_object.GregorianCalender_class;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class AbstractionClassExample_111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        YOĞURT yoğurt = new YOĞURT("Yörsan", 45.85, 250);
        KOLA kola = new KOLA("Fanta", 24.75, 3000);
        System.out.println(yoğurt);
        try {
            System.out.println("enter the number of product will be exract from the depo");
            yoğurt.extractFromStock(input.nextInt());
            System.out.println(yoğurt.getNumberOfStock());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        seeTheExpiration(yoğurt);
        seeTheExpiration(kola);




    }

    public static void seeTheExpiration( AbstractClassExemple_1 test){
        System.out.println(test.setTheExpirationDate());
    }
}
