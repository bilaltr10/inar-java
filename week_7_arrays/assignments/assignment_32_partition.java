package week_7_arrays.assignments;

import java.util.Scanner;

public class assignment_32_partition {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the length of list");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = input.nextInt();
        }
        partition(list);

        System.out.print("After the partition , the list is ");
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
    public static int[] partition(int[] list) {
        boolean x = false;
        int pivot = list[0];
        int count = 0;

        for (int i = list.length - 1; i > 0; i--) {
            if (x && count < list.length) {
                i++;
            }
            x = false;

            if (pivot > list[i]) {
                for (int shift = 0; shift < 1; shift++) {
                    x = true;
                    int temp = list[i]; // Geçici bir değişken kullanarak son öğeyi saklayın
                    for (int z = i; z > 0; z--) {
                        list[z] = list[z - 1];
                    }
                    list[0] = temp; // Geçici değişkeni ilk öğeye yerleştirin

                }
                count++;
            }
        }


        return list;

    }

}

