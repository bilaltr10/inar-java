package week_3.assignements;
//(Sort three integers) Write a program that prompts the user to enter three integers
//and display the integers in non-decreasing order

import java.util.*;

public class assignement_8 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("kaç tane sayı girmek istiyorsunuz ");
        int amountOfNumber = bilal.nextInt();

        int[] array = new int[amountOfNumber ];
        for (int i = 0; i < amountOfNumber; i++) {
            System.out.print((i + 1) + " . sayı  : ");
            array[i] =(int) (Math.random()*100);
            System.out.print(array[i]+"\n");
        }
        for (int a : array) {
            System.out.print(a + "  ");
        }
        System.out.println();
        int temp = 0;
        for (int i = 0; i < amountOfNumber-1; i++) {
            for (int m = 0; m < amountOfNumber-1; m++) {
                if (array[m] > array[m + 1]) {
                    temp = array[m];
                    array[m] = array[m + 1];
                    array[m + 1] = temp;
                }
            }
        }
        for (int a : array) {
            System.out.print(a + "  ");
        }


    }
}
/*Bubble Sort, sıralama algoritmalarından biridir.
Temel olarak iki elemanın yer değiştirmesi yoluyla dizi içindeki elemanları
sıralamayı amaçlar. Adını, büyük elemanların yavaş yavaş "yüzeye çıktığı" bir kabarcık benzetmesinden alır.
 Ancak verimlilik açısından büyük veri setleri için pek tercih edilen bir algoritma değildir,
  çünkü en kötü durumda O(n^2) zaman karmaşıklığına sahiptir.
 İşleyişi şu şekildedir:
Dizi boyunca her iki ardışık eleman karşılaştırılır.
Eğer bu iki eleman sıralama kriterine uymuyorsa (örneğin, büyük eleman küçük olandan önce geliyorsa),
 bu iki elemanın yerleri değiştirilir.
Bu işlem dizinin başından sonuna kadar devam eder. Bu adımın sonunda en büyük eleman dizinin sonuna gelir.
İlk adımdaki işlemi dizinin sonuna kadar uyguladıktan sonra, en büyük elemanın sonunda olduğu kesinleşir.
 Bu nedenle bir sonraki adımda son eleman dikkate alınmaz.
İkinci adımdan itibaren, dizinin bir eleman eksik olarak tekrar eden
işlemlerle dizinin sıralanmış kısmı genişlerken, en büyük eleman giderek sağa doğru kayar.
 Sıralama tamamlanana kadar bu adımlar tekrarlanır.
Bu algoritma sıralama işlemi bitene kadar devam eder.
 Ancak, veri seti büyüdükçe ve eleman sayısı arttıkça,
 sıralama işlemi yavaşlar ve performans düşer. Bu nedenle büyük veri
 setleri için daha hızlı sıralama algoritmaları tercih edilir, örneğin Quick Sort veya Merge Sort gibi.
 */