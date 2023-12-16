package week_14;

import java.util.*;

public class Q_19 {
    public static void main(String[] args) {
        //System.out.println("Enter DNA Sequence  :  ");
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGAAGGGTTT";

        //find 5-letter codes
        ArrayList<String> allTheCodes = codesInFiveLetter(s);
        //write the codes once
        Set<String> codesWithoutRepetition = new HashSet<>(allTheCodes);
        //send to ArrayList
        ArrayList<String> listOfCodesWithoutRepetition = new ArrayList<>(codesWithoutRepetition);
        //to have untouched list of codes remake the allTheCodes ArrayList
        ArrayList<String> newAllTheCodes = new ArrayList<>(allTheCodes);

        //extract the once and remains are 5-letter codes more than 2
        for (String string : listOfCodesWithoutRepetition) {
            newAllTheCodes.remove(string);
        }
        System.out.println("Repeated 5-letter sequences  : " + newAllTheCodes);
    }


    public static ArrayList<String> codesInFiveLetter(String s) {
        ArrayList<String> allTheCodes = new ArrayList<>();
        for (int i = 0; i < s.length() - 4; i++)
            allTheCodes.add(s.substring(i, i + 5));
        return allTheCodes;
    }
}
