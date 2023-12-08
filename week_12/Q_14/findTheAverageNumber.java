package week_12.Q_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findTheAverageNumber {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file path name");
       //C:\Users\HP\workspace\inar-java\src\week_12\Q_14\notes.txt
        String pathName = input.next();
        File file = new File(pathName);

        if(!file.exists()){
            System.out.println("File : Not Exist");
            System.exit(0);
        }

        Scanner scanner = new Scanner(file);

        double total =0;
        int numberOfIntegers =0;
        while(scanner.hasNext()){
            total+= scanner.nextDouble();
            numberOfIntegers++;
        }
        System.out.println("Total number of scores");
        System.out.println("Number of integers : "+ numberOfIntegers);
        System.out.println("Average : "+ total /numberOfIntegers);
    }
}
