package week_11.Q_1.Q_9;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size :");
        int size = input.nextInt();

        int[][] list = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
              //  list[i][j] = (int) (Math.random() * 2);
                System.out.print(list[i][j] = (int) (Math.random() * 2));
                System.out.print(" ");
            }
            System.out.println();
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        findTheMaxColumn(list, list1);
        findTheMaxRow(list, list2);


    }

    public static void findTheMaxRow(int[][] list,ArrayList<Integer> list2 ){

        int max =-1;

        for (int i = 0; i <list.length ; i++) {
            int total=0;
            for (int j = 0; j <list[0].length ; j++) {
                total +=list[i][j];

            }
            if(total>max){
               max = total;
                list2.clear();
                list2.add(i);
            }
            else if (total == max){
                list2.add(i);
            }
        }
        System.out.println("Largest row index(es) "+list2.toString());

    }
    public static void findTheMaxColumn(int[][] list,ArrayList<Integer> list1 ){

        int max =-1;

        for (int i = 0; i <list[0].length ; i++) {
            int total=0;
            for (int j = 0; j <list.length ; j++) {
                total +=list[j][i];

            }
            if(total>max){
                max = total;
                list1.clear();
                list1.add(i);
            }
            else if (total == max){
                list1.add(i);
            }
        }
        System.out.println("Largest column index(es) "+list1.toString());

    }

}
