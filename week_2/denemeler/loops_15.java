package week_2.denemeler;

import java.util.*;
//Write a Java program to calculate the factorial of a number using a recursive function.
// kullanıcı pozitif bir sayı girerse işlem bitiyor ama negatif bir sayı girerse tekrar soruyor pozitif girene kadar
// ikinci adımda işlem hep devam edecek taki kullanıcı exit yazana kadar
public class loops_15 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
                String  yes ;
        do {
            System.out.println("enter the number to learn its (!) factorial value ");
            int number = bilal.nextInt();
            int number1 = 0;
            if (factorial(number) > 0) System.out.println(number + "! is  : " + factorial(number));
            else {
                do {
                    System.out.println("Negatif  veya çok büyük bir sayı girdiniz lütfen 0 , pozitif  veya integer değer \naralığında sonucu olan bir sayı girin ");
                    number1 = bilal.nextInt();
                }
                while ((factorial(number1) == -1));
                if (factorial(number1) > 0) System.out.println(number1 + "! is  : " + factorial(number1));
            }
            System.out.println("çıkmak için e(xit) ' ye devam etmek için c(ontinue) 'ye tıklayın ");
            yes = bilal.next();


        }while (yes.equals("c") );


        if (yes.equals("e")) {
            System.out.println("Uygulamamızı kullandığınız için teşekkür ederiz.");

        }
    }
    public static int factorial(int a) {
        if (a < 0)
            return -1;
        else if (a == 0 || a == 1)
            return 1;
        else
            return a * factorial(a - 1);

    }
}
