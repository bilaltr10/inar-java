package week_12.Q_17;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class makeThetxt {
    public static void main(String[] args) throws IOException {

        File file = new File("src/week_12/Q_17/hangman_Vocabulary_List.txt");

        file.createNewFile();

        try(
        PrintWriter printWriter = new PrintWriter(file);
        )
        {
            printWriter.print("female");
            printWriter.print(" ");
            printWriter.print("fortune");
            printWriter.print(" ");
            printWriter.print("paper");
            printWriter.print(" ");
            printWriter.print("freak");
            printWriter.print(" ");
            printWriter.close();
        }


    }
}
