package week_10.Q_27;

import java.util.Arrays;

public class stringBuilder2 {

    String s;

    public stringBuilder2() {
        this("bir ifade giriniz");
    }

    public stringBuilder2(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            s +=chars[i];
        }


    }

    public stringBuilder2(String s) {
        this.s = s;
    }

    public stringBuilder2 insert(int offset, stringBuilder2 s) {
       this.s = this.s.substring(0,offset);
        this.s += s;
this.s +=this.s.substring(offset);

        return new stringBuilder2(String.valueOf(s));

    }

    public String toString() {
        return s;

    }
}
