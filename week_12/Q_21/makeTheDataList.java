package week_12.Q_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class makeTheDataList {
    /*(Data sorted?) Write a program that reads the strings from �le SortedStrings. txt and
reports whether the strings in the �les are stored in increasing order. If the strings are not
sorted in the �le, displays the �rst two strings that are out of the order*/

    public static void main(String[] args) throws IOException {
        File file = new File("src/week_12/Q_21/fileSortedStrings.txt");

        file.createNewFile();


        try (
                PrintWriter printWriter = new PrintWriter(file);
        ) {
            printWriter.print("5 ");
            printWriter.print("9 ");
            printWriter.print("7 ");
            printWriter.print("12 ");
                        printWriter.close();
        }
    }


}
