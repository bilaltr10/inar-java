package week_10.Q_24;

import static java.lang.Character.isUpperCase;

public class MyCharacter {

    char ch;

    MyCharacter(char ch) {
        this.ch = ch;
    }

    public char charValue() {
        return ch;
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public static int compare(char x, char y) {
        return x - y;
    }

    public int compareTo(MyCharacter c) {
        return charValue() - c.charValue();
    }

    public boolean equals(MyCharacter c) {
        return (compareTo(c) == 0);
    }

    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static char toLowerCase(char ch) {
        if (isLetter(ch))
            if (isUpperCase(ch)) return (char) (ch + 32);
            else return ch;
        return ch;
    }

    public static boolean isLowerCase(char ch) {
        return ('a' <= ch && ch <= 'z');
    }

    public static boolean isUpperCase(char ch) {
        return ('A' <= ch && ch <= 'Z');
    }

    public static char toUpperCase(char ch) {
        if (isLetter(ch))
            if (isLowerCase(ch)) return (char) (ch - 32);
            else return ch;
      else return ch;
    }

    public String toString() {
        return String.valueOf(ch);
    }
}
