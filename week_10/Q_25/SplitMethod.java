package week_10.Q_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitMethod {
    public static void main(String[] args) {

        String str = "Java/in#ar-aca*demy";
        String regex = "#*/-";
        ArrayList<String> list = split(str, regex);
        System.out.println(list.toString());

    }

    public static ArrayList<String> split(String str, String regex) {
        ArrayList<String> list = new ArrayList<>();
        boolean isThere;
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            isThere = false;
            for (int j = 0; j < regex.length(); j++) {
                if (str.charAt(i) == regex.charAt(j)) {
                    isThere = true;
                    break;
                }
            }
            if (isThere) {
                list.add(s);
                s = "";
            } else {
                s += str.charAt(i);
            }
        }
        list.add(s);
        return list;
    }


}



