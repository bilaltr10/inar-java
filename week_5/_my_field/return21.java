package week_5._my_field;

import java.util.Scanner;

public class return21 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in );
        System.out.printf("%-10s %10s  |  %-10s %-10s", "Kilograms", "Pounds", "Miles", "Kilometers");
        int count = 20;

        for (int i = 1; i < 201; i += 2) {
            System.out.printf("\n%-10d %10.1f  |  %-10d %-10.2f", i, (i * 2.2), count, (count / 2.2));
            count+=5;}
     /*   System.out.print("İlk sayıyı gir :");
        int a = bilal.nextInt();
        System.out.print("İkinci sayıyı gir :");
        int b = bilal.nextInt();
 double result =   substraction(a,b);
        System.out.println("Result : "+ result);
    }

    public static double substraction ( int a ,int b){

    if ( a - b >=0 ){
        return a-b ;
    }
    else {
        return (a-b)*-1;
    }
*/

    }
}
