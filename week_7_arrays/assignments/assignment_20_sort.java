package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_20_sort {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter 10 number ");
        int [] list = new int [10];
        for (int i = 0; i <list.length ; i++) {
            list[i] =(int) (Math.random()*65);
            System.out.print(list[i] +"  ");
        }
        System.out.println();

        for(int i =0 ; i<list.length-1; i++) {
            int currentMin =list[i];
            int indis =i;

            for (int m = i+1; m < list.length; m++) {
                if (currentMin>list[m]) {
                    currentMin = list[m];
                    indis = m;
                }
                }
                if ( indis !=i){
                    list[indis]= list[i];
                    list[i] = currentMin;
                }


        }

        for (int a : list){
            System.out.print(a + "  ");
        }
    }
}
