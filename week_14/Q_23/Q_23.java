package week_14.Q_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Q_23 {
    public static void main(String[] args) throws FileNotFoundException {


        ArrayList<String> words = takeTheWordsFromFile();

        Set<String> setList = new HashSet<>(words);

        HashMap<String, Integer> hashList = makeTheHashMapList(setList);


        countTheWords(hashList, words);

        nonDuplicatesAscendingOrder(hashList);

    }

    public static ArrayList<String> takeTheWordsFromFile()  {
        ArrayList<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\Users\\HP\\workspace\\inar-java\\src\\week_14\\Q_23\\notes.txt"))) {
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;

    }

    public static HashMap<String, Integer> makeTheHashMapList(Set<String> setList) {
        HashMap<String, Integer> hashList = new HashMap<>();
        for (String s : setList) {
            hashList.put(s, 0);
        }
        return hashList;
    }

    public static void countTheWords(HashMap<String, Integer> hashList, ArrayList<String> words) {
        for (String word : words) {
            if (hashList.containsKey(word)) {
                int a = hashList.get(word) + 1;
                hashList.put(word, a);
            }
        }
        System.out.println("Words and counts :");
        System.out.println(hashList);
    }

    public static void nonDuplicatesAscendingOrder(HashMap<String, Integer> hashList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hashList.entrySet()) {
            if (entry.getValue().equals(1)) {
                arrayList.add(entry.getKey());
            }
        }

        showTheNonDuplicatesAscendingOrder(sortTheWords(arrayList));

    }

    public static ArrayList<String> sortTheWords(ArrayList<String> arrayList) {
        Collections.sort(arrayList);
        return arrayList;

    }

    public static void showTheNonDuplicatesAscendingOrder(ArrayList<String> arrayList) {
        System.out.println("Non-duplicate words in ascending order : ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
