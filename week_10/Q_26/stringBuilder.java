package week_10.Q_26;

public class stringBuilder {
    String str;

    public stringBuilder(String str) {
        this.str = str;
    }

    public stringBuilder append(stringBuilder s) {
        return new stringBuilder(str + s);
    }

    public stringBuilder append(int i) {
        return new stringBuilder(str + i);
    }

    public int length() {
        return str.length();
    }

    public char charAt(int index) {
        return str.charAt(index);
    }

    public stringBuilder toLowerCase() {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                s += (char) (str.charAt(i) + 32);
            } else {
                s += (char) (str.charAt(i));
            }

        }return new stringBuilder(s);
    }

        public stringBuilder substring ( int begin, int end){
            String s = "";
            for (int i = begin; i < end; i++) {
                s += str.charAt(i);
            }
            return new stringBuilder(s);
        }
        public String toString () {
            return str;
        }
    }
