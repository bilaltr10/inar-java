package week_12.Q_15;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class readTheFiles {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_15\\Ouestion_12_15.txt");
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(file);


        while (input.hasNext()) {
            list.add(input.nextInt());

        }
        Collections.sort(list);

        for (int i = 0; i <list.size() ; i++) {
            if(i %10 ==0) System.out.println();
            System.out.printf("%-3d",list.get(i));

        }
        }
}

