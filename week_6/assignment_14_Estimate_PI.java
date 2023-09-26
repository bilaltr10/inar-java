package week_6;

import java.util.Scanner;

public class assignment_14_Estimate_PI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s %10s","i","m(i)\n");
        for ( int i =1 ; i<=1000; i+=100){

            System.out.printf("%-10d %10.5f %s",i,findPINumber(i),"\n");

        }
    }
    public static double findPINumber(int number ){
        double result =0;
boolean x = true;
        for ( int i =1 ; i <=number; i++){

            if (x){
                result +=1.0/(2*i-1);
            x =false;
            }
            else {
                result += -1.0/(2*i-1);
           x=true;
            }


        }


        return 4*result;
    }
}
