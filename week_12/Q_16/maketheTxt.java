package week_12.Q_16;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class maketheTxt {
    public static void main(String[] args) throws IOException {
        File file = new File("//C:/Users/HP/workspace/inar-java/src/week_12/Q_16/names.txt");

        file.createNewFile();

        try (
                PrintWriter input = new PrintWriter(file);
        ) {
            input.print("bilal ");
            input.println("topal");
            input.print("bilal ");
            input.println("topal");

          input.close();;
        }


    }
}
