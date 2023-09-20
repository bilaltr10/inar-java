package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_18_four_different_shape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hedef = 6;
        int m = 1;
        for (int i = 1; i <= hedef; i++) {
            for (m = 1; m <= i; m++) {
                System.out.print(m + " ");
                if (m  == i) System.out.println();

            }
        }
        System.out.println("-----------------------------------------------------");


        for (int i = 1; i <= hedef; i++) {
            for (m = 1; m <= hedef - i + 1; m++) {
                System.out.print(m + " ");

                if (m == hedef - i + 1)
                    System.out.println();
            }
        }
        System.out.println("-----------------------------------------------------------");


        for (int i = 1; i <= hedef; i++) {
            for (m = hedef - i ; m > 0; m--) {
                System.out.print("  ");

            }
            for (int t = i; t > 0; t--) {
                System.out.print(" "+t);
           if ( t ==1 ){
               System.out.println();
           }
            }

        }

        System.out.println("--------------------------------------------------------------");
for ( int i = 1 ; i<= hedef ; i++){

    for ( int z = 1 ; z<i ; z++){
        System.out.print("  ");

    }
for ( int h = 1 ; h <=hedef -i +1 ; h++){
    System.out.print(h + " ");

if ( h ==hedef -i +1 ){
    System.out.println();
}
}

}

    }
}
