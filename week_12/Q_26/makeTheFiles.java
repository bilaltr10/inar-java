package week_12.Q_26;

import java.io.File;
import java.io.IOException;

/*(Replace words) Suppose you have a lot of files in a directory that contain words
Questioni_j, where i and j are digits. Write a program that pads a 0 before i if i is a single
digit and 0 before j if j is a single digit. For example, the word Question2_1 in a file will be
replaced by Question02_01. In Java, when you pass the symbol * from the command line, it
refers to all files in the directory. Use the following command to run your program.*/
public class makeTheFiles {

    public static void main(String[] args) throws IOException {

        int first =0;
        int second =0;

        while (first<15){
            File file = new File("src/week_12/Q_26/Question_"+first+"_"+second+".txt");
            file.createNewFile();
            first++;
            second++;
        }

    }
}
