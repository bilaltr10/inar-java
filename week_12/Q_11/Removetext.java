package week_12.Q_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Removetext {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 4) {
            System.out.println("The path is ... ");
            System.exit(1);
        }

        File currentFile = new File(args[0]);
        if(!currentFile.exists()){
            System.out.println("CurrentFile doesnt exist");
            System.exit(2);
        }
File targetFile = new File(args[1]);
        if(targetFile.exists()){
            System.out.println("Target file already exist");
        System.exit(3);
        }
        try(
            Scanner input = new Scanner(currentFile);
            PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2],args[3]);
                output.println(s2);

            }
        }
        }
    }

