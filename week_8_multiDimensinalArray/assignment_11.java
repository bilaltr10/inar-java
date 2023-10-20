package week_8_multiDimensinalArray;
import java.util.Scanner;
public class assignment_11 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] list = new int[9];
        int x = enterTheNumber();
        System.out.println("The number is : "+ x);
        while (x > 0) {
            x = sendTheNumber(x, list);
        }
        int[][] multiDimArray = convertTheListMultiDimensionalArray(list);
        writeHeadsAndTails(multiDimArray);
    }
    public static int enterTheNumber() {
        System.out.println("Enter 0 to enter number or it will be entered randomly");
        int x = input.nextInt();
        if (x == 0) {
            return input.nextInt();
        } else return (int) (Math.random() * 512);
    }
    public static int sendTheNumber(int a, int[] list) {
        int divisor = 0;
        while ((int) (Math.pow(2, divisor)) <= a) {
            divisor++;
        }
        divisor--;
        list[8-divisor] = 1;
        return  a - ((int) (Math.pow(2, divisor)));
    }

       public static int[][] convertTheListMultiDimensionalArray(int[] list) {
        int[][] array = new int[3][3];
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = list[m];
                m++;
            }}
        return array;
    }
    public static void writeHeadsAndTails(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j] == 1) System.out.print("T ");
                else System.out.print("H ");
            }System.out.println();
        }}}
