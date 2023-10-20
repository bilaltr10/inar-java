package week_8_multiDimensinalArray;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class assignment_15 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number of points points ");
        int numberOfPoints = input.nextInt();

        double[][] list = new double[numberOfPoints][2];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = input.nextDouble();
            }
        }
        System.out.println("The "+ numberOfPoints+" points are"+ ((!isOnTheSameLine(list))? " not ":" ")+"on the same line ");

    }

    public static boolean isOnTheSameLine(double[][] list) {
        double result;
        int count = 2;
        for (int i = 2; i < list.length; i++) {
            result = ((list[1][0] - list[0][0] )* (list[i][1] - list[0][1])) -( (list[i][0] - list[0][0])*(list[1][1]-list[0][1]));
            if (result == 0) {
                count++;
            }
        }
        return count == list.length;


    }

}
