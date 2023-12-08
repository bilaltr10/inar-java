package week_12.Q_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BabyNamePopularityRanking {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        String year = year();

        char sexe = sexe();

        String name = name();

        ArrayList<String> arrayList = arraylist();

        String chosenPath = chosenText(arrayList, year);

        String rankOfName = findTheRateOfName(chosenPath, name, year);

        System.out.println(rankOfName);

    }

    public static String year() {
        boolean isTrue = true;
        int year;
        do {
            System.out.println("Enter the year between 2001 and 2005");
            year = input.nextInt();
            if (year >= 2001 && year <= 2005) {
                isTrue = false;
            }

        } while (isTrue);
        return year + "";

    }

    public static char sexe() {
        boolean isTrue = true;
        char sexe;
        do {
            System.out.println("Enter the sexe : ");
            sexe = input.next().charAt(0);
            if (sexe == 'f' || sexe == 'm') {
                isTrue = false;
            }
        } while (isTrue);

        return sexe;
    }

    public static String name() {
        System.out.println("Enter the name :");
        return input.next().toUpperCase();

    }

    public static ArrayList<String> arraylist() {
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 2001; i < 2006; i++) {
            arrayList.add("C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_30\\babynameranking" + i + ".txt");

        }

        return arrayList;
    }

    public static String chosenText(ArrayList<String> arrayList, String year) {
        for (String s : arrayList) {
            if (s.contains(year)) {
                return s;
            }
        }
        return "";
    }

    public static String findTheRateOfName(String chosenPath, String name, String year) {
        File file = new File(chosenPath);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String rank = scanner.next();
                String maleName = scanner.next().toUpperCase();
                String maleNumber = scanner.next();
                String femaleName = scanner.next().toUpperCase();
                String femaleNumber = scanner.next();
                if (femaleName.equals(name) || maleName.equals(name)) {
                    return name + " is ranked as #" + rank + " in the year of " + year;

                } else if (rank.equals("1000")) {
                    return name + " is not in the Top-1000 names in year of " + year;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
        return "";
    }
}





