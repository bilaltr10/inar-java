package week_14;

import java.util.*;

public class Q_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user until -1 is entered
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter words (enter -1 to stop):");
        String input = scanner.nextLine();
        while (!input.equals("-1")) {
            words.add(input);
            input = scanner.nextLine();
        }

        // Group anagrams
        Map<String, List<String>> anagramGroups = groupAnagrams(words);
        List<String> list = new ArrayList<>();
        // Display the result
        System.out.println("\nAnagram Groups:");
        for (List<String> group : anagramGroups.values()) {
            list.add(group.toString());
        }
        System.out.println(list);
        scanner.close();
    }


    private static Map<String, List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            // Sort the characters of the word to identify anagrams
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Check if the anagram group already exists
            if (anagramGroups.containsKey(sortedWord)) {
                anagramGroups.get(sortedWord).add(word);
            } else {
                // Create a new anagram group
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                anagramGroups.put(sortedWord, newGroup);
            }
        }

        return anagramGroups;
    }
}
//bilal
//lalib
//eksi
//esik
//ben
//yurt
//-1

