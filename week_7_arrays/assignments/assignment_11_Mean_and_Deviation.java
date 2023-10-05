package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_11_Mean_and_Deviation {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        double[] array = makeAnArray();
        double total = totalOfArray(array);
        double mean = meanOfArray(total , array.length);
        double deviation = findDeviation(array,mean);

        System.out.printf("The mean is :  %10.3f %n", mean);
        System.out.printf("The deviation is  : %-9.3f ",deviation);
    }

    public static double[] makeAnArray() {
        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] =(Math.random()*10)+5 ;
        }

        return array;
    }

    public static double totalOfArray(double[] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public static double meanOfArray(double total , int count ){
        return  total/count;
    }
    public static double findDeviation(double[] array , double mean){
       double total =0;
        for (int i = 0; i < array.length; i++) {
            total += Math.pow(array[i]-mean,2);
        }
        return Math.sqrt(total/ (array.length-1));


    }
}
