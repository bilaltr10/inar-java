package week_8_multiDimensinalArray;
import java.util.Scanner;
public class assignment_14 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the size for the matrix : ");
        int sizeOfMatrix = input.nextInt();
        int[][] list = makeTheArray(sizeOfMatrix);

        checkTheRow3(list);
        checkTheColumn(list);
        checkTheMajorDiagonal(list);
        checkTheSubDiagonal(list);
    }

    public static int[][] makeTheArray(int size) {
        int[][] list = new int[size][size];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j] = (int) (Math.random() * 2);
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        return list;
    }

    public static void checkTheRow3(int[][] list) {
        String[] array = new String[]{" ", " "};
        int count;
        for (int m = 0; m < 2; m++) {
            for (int[] ints : list) {
                count = 0;
                for (int j = 0; j < list.length; j++) {
                    if (ints[j] == m) {
                        count++;
                    }
                }
                if (count == list.length) {
                    array[m] += m + " ";
                }}}
        writeForColumnAndRow(0, array);
    }

    public static void checkTheColumn(int[][] list) {
        String[] array = new String[]{" ", " "};
        int count;
        for (int m = 0; m < 2; m++) {
            for (int i = 0; i < list[0].length; i++) {
                count = 0;
                for (int j = 0; j < list.length; j++) {
                    if (list[j][i] == m) {
                        count++;
                    }
                }
                if (count == list.length) {
                    array[m] += m + " ";
                }}}
        writeForColumnAndRow(1, array);
    }

    public static void checkTheMajorDiagonal(int[][] list) {
        String[] array = new String[]{" ", " "};
        int count;
        for (int m = 0; m < 2; m++) {
            count = 0;
            for (int i = 0; i < list.length; i++) {
                for (int j = i; j < i + 1; j++) {
                    if (list[i][j] == m) {
                        count++;
                    }}
                if (count == list.length) {
                    array[m] += m + " ";
                }}}
      writeForDiagonals(0,array);
    }


    public static void checkTheSubDiagonal(int[][] list) {
        String[] array = new String[]{" ", " "};
        int count;
        for (int m = 0; m < 2; m++) {
            count = 0;
            for (int i = 0; i < list.length; i++) {
                for (int j = list.length - i - 1; j < list.length - i; j++) {
                    if (list[i][j] == m) {
                        count++;
                    }}
                if (count == list.length) {
                    array[m] += m + " ";
                }}}
        writeForDiagonals(1,array);
         }

         public static void writeForColumnAndRow(int a, String[] array) {
        String str;
        if (a == 0) str = "row";
        else str = " column";
        if (array[0].equals(" ") && array[1].equals(" ")) {
            System.out.println("No same number on a " + str);
        } else {
            for (int i = 0; i < 2; i++) {
                if (array[i].equals(" "))  System.out.println("No " + i + "s on the the " + str);
                 else System.out.println("All the " + i + "s on " + str + array[i]);
                }}}


        public static void writeForDiagonals(int a, String[] array){
        String str;
        if (a == 0) str = " major diagonal";
        else str = " sub-diagonal";
        if (array[0].equals(" ") && array[1].equals(" ")) {
            System.out.println("No same number on a"+str);
        } else {
            for (int i = 0; i < 2; i++) {
                if (!array[i].equals(" ")) {
                    System.out.println(i + "s on the"+str);
                }}}}
}

