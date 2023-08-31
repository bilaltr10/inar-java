package week_3.assignements;
//(Game: add three numbers ) Generate three single-digit integers and prompt the user to
//enter the sum of these three integers
// if bloğuna bak güzel oldu normal döngüde ols bir + fazla oluyordu
import java.util.*;

public class assignement_2 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("kaç adet sayının toplama işlemini yapmak istiyorsunuz ?");
        int adet = bilal.nextInt();
        int toplam = 0;
        int değer = 0;
        for (int i = 1; i <= adet; i++) {
            değer = (int) (Math.random() * 10);
            System.out.print(değer);

            if (i < adet) {
                System.out.print(" + ");
            }
                if( i == adet ) {
                    System.out.println(" = ");
                    System.out.print("lütfen cevabınızı girin ");
                }
            toplam += değer;

        }


        int cevap = bilal.nextInt();
        if (toplam == cevap) System.out.println(" cevap doğru tebrikler ");
        else {
            System.out.println("cevap yanlış ");
            System.out.println("doğru vevap = " + toplam + " ");
        }
    }
}
