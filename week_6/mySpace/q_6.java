package week_6.mySpace;

import java.util.Scanner;

//Create a Java program that reverses the order of words in a
// given sentence while maintaining the order of characters within each word.
public class q_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = input.nextLine();

        System.out.println(reverseSentence(str).trim());
    }

    public static String reverseSentence(String str) {

        str = " " + str;
        String newstr = "";
        int count = str.length() - 1;
        int j;
        for (int i = str.length() - 1; i > 0; i--) {

            for (j = count; j >= 0; j--) {
                if (str.charAt(j) == ' ') {
                    newstr += str.substring(j, count + 1);
                    break;
                }
            }
            count -= (count - j);
            count--;

        }
        return newstr;
    }

    /*int maxLength = 0;
    int left = 0;
    int right = 0;
    Set<Character> uniqueChars = new HashSet<>();

    while (right < s.length()) {
        char currentChar = s.charAt(right);
        if (!uniqueChars.contains(currentChar)) {
            uniqueChars.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        } else {
            uniqueChars.remove(s.charAt(left));
            left++;
        }
    }

    return maxLength;*/
}



