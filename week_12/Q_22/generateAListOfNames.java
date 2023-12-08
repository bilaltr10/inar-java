package week_12.Q_22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class generateAListOfNames {
    public static void main(String[] args) throws IOException {
        File file = new File("src/week_12/Q_22/names.txt");

        file.createNewFile();
        int i = 0;
        double salary = 0;
            try (
                    PrintWriter printWriter = new PrintWriter(file);
            ) {
                while (i < 1000) {

                printWriter.printf("%-10s","NAMES ");
                printWriter.printf("%-10s","SURNAMES ");
                int rank = (int) (Math.random() * 3);
                switch (rank) {
                    case 0:
                        printWriter.printf("%-10s","assistant ");
                        salary = Math.random() * 30000 + 50000;
                        printWriter.printf("%.2f",salary);
                        break;
                    case 1:
                        printWriter.printf("%-10s","associate ");
                        salary = Math.random() * 50000 + 60000;
                        printWriter.printf("%.2f",salary);
                        break;

                    case 2:
                        printWriter.printf("%-10s","full ");
                        salary = Math.random() * 75000 + 55000;
                        printWriter.printf("%.2f",salary);
                        break;
                }
                printWriter.println();
                    i++;

                }

        }
    }
}
