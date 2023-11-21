package week_10.Q_22;

public class MyString {

    private char[] chars;

    public MyString(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        if (index > length()) {
            System.out.print("Index is more than array length");
            return '.';
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString substring(int begin, int end) {
        char[] newArray = new char[end - begin];

        for (int i = begin; i < end; i++) {
            newArray[i] = charAt(i);
        }
        return new MyString(newArray);
    }


    public MyString toLowerCase() {
        char[] newChar = new char[length()];

        for (int i = 0; i < length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                newChar[i] = (char) (charAt(i) + 32);
            } else {
                newChar[i] = chars[i];
            }

        }
        return new MyString(newChar);
    }

    public boolean equals(MyString s) {
        if (length() != s.length()) {
            return false;

        }
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != s.charAt(i))
                return false;
        }

        return true;
    }

    public String toString() {
        String s = new String(chars);
        return s;
    }

    public static MyString valueOf(int i) {
        String str = Integer.toString(i);
        char[] x = new char[str.length()];

        for (int j = x.length - 1; j >= 0; j--) {
            x[j] = (char) ('0' + i % 10);
            i /= 10;
        }
        return new MyString(x);
    }
}
