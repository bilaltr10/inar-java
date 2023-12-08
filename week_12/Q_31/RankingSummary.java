package week_12.Q_31;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RankingSummary {
    public static void main(String[] args) throws FileNotFoundException {

        writeTheUp();

        for (int i = 2001; i < 2006; i++) {
            String path = "C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_30\\babynameranking" + i + ".txt";
            File file = new File(path);
            ArrayList<String> maleNames = new ArrayList<>();
            ArrayList<String> femaleNames = new ArrayList<>();
            try (Scanner scanner = new Scanner(new File(path))) {
                int counter = 0;
                System.out.printf("%-12s", i);
                while (scanner.hasNext()) {
                    while (counter < 5) {
                        String rank = scanner.next();
                        maleNames.add(scanner.next());
                        String maleNumber = scanner.next();
                        femaleNames.add(scanner.next());
                        String femaleNumber = scanner.next();

                        counter++;
                    }
                    break;

                }
                for (int j = 0; j < maleNames.size(); j++) {
                    System.out.printf("%-12s", maleNames.get(j));
                }
                for (int j = 0; j < femaleNames.size(); j++) {
                    System.out.printf("%-12s", femaleNames.get(j));
                }
            }

            System.out.println();
        }

    }


    public static void writeTheUp() {
        System.out.println("____________________________________________________________________________-");
        System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s", "Year", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        System.out.printf("%-12s%-12s%-12s%-12s%-12s", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
        System.out.println();
    }


}

