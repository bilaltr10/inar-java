package week_12.Q_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {


        if (args.length != 3) {
            System.out.println("The path is ... ");
            System.exit(1);
        }

        File currentFile = new File(args[0]);
        if (!currentFile.exists()) {
            System.out.println("CurrentFile doesnt exist");
            System.exit(2);
        }
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input = new Scanner(currentFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.next();
                list.add(s1.replaceAll(args[1], args[2]));


            }

        }
        try (
                PrintWriter output = new PrintWriter(currentFile);
        ) {
            for (String s : list) {
                output.println(s);
            }
        }
    }
}