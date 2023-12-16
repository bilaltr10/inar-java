package week_14.Q_16;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Q_16 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\HP\\workspace\\inar-java\\src\\week_14\\Q_16\\notes.txt");

        Scanner scanner = new Scanner(file);
        String str = "";
        while (scanner.hasNext()) {
            str += scanner.next().toLowerCase(Locale.ROOT) + " ";
        }
        System.out.println(str);

        String[] dilArray = str.split("[\\s,;.:?'\"\\(\\)]");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(dilArray));


        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        Set<String> uniqueSet = new HashSet<>(words);
        ArrayList<String> distinctWord = new ArrayList<>(uniqueSet);
        HashMap<String, Integer> countTheWords = new HashMap<>();


        for (String s : distinctWord) {
            countTheWords.put(s, 1);
        }

        for (String word : words) {
            if (countTheWords.containsKey(word)) {
                int a = countTheWords.get(word) + 1;
                countTheWords.put(word, a);
            }
        }

        for (String s : distinctWord) {
            System.out.println(s + " : " + countTheWords.get(s));
        }


    }
}
