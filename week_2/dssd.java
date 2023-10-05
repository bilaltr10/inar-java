package week_2;

import java.util.Scanner;

public class dssd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = "overlappingoverlapping";
        String b ="";
        for (int i =0; i<a.length()/2+1; i++){
            System.out.println("soldan :"+a.substring(0,i));
            System.out.println("sağdan :"+a.substring(a.length()-i));
            if ( a.substring(0,i).equals(a.substring(a.length()-i))){
                b = a.substring(0,i);
                System.out.println("içeri girdi :"+" "+b);
            }
        }
        System.out.println("\ncevap  --->"+b);

    }
}
