package week_10.Q_23;

import java.util.Locale;

public class MyString2 {

    String str;

    public MyString2(String str) {
        this.str = str.toUpperCase(Locale.ROOT);
    }

    public int compare(String s) {
        int i = 0;
        s = s.toUpperCase(Locale.ROOT);
        str = str.toUpperCase(Locale.ROOT);
        while (i < s.length() && i < str.length()) {
            int charDifference = str.charAt(i) - s.charAt(i);
            if (charDifference != 0) {
                return charDifference;
            }
            i++;
        }

        return Integer.compare(s.length(), str.length()); // bunu yeni öğrendim.
    }

    public MyString2 substring(int begin) {
        String s = "";
        while (begin != str.length()) {
            s += str.charAt(begin);
            begin++;
        }

        return new MyString2(s);
    }

    public MyString2 toUpperCase() {
        return new MyString2(str.toUpperCase(Locale.ROOT));
    }

    public char[] toChars() {
        char[] ch = new char[str.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        return ch;

    }
    public static MyString2 valueOf(boolean b) {
        return (b ? new MyString2("true") : new MyString2("false"));
    }
    public String toString(){
        return str;
    }
}











