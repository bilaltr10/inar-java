package week_12.Q_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class findTheUnsorted {
    public static void main(String[] args) throws FileNotFoundException {
        String sourcePath = "C:/Users/HP/workspace/inar-java/src/week_12/Q_21/fileSortedStrings.txt";
        String currentSmallValue = "Integer.MIN_VALUE";
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        try (
                Scanner scanner = new Scanner(new File(sourcePath))

        ) {
            while (scanner.hasNext()) {

                list.add(scanner.next());
               if(i>1) {
                   if (list.get(i).compareTo(list.get(i - 1)) < 0) {
                       System.out.println(list.get(i-1) +" and "+ list.get(i)+ " is out of order");
                       System.exit(1);

                   }
               }
i++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
