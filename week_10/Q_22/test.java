package week_10.Q_22;

public class test {
    public static void main(String[] args) {
        char[] char1 = {'I', 'N', 'A', 'R'};

        MyString myString = new MyString(char1);
        System.out.println(myString.length());
        MyString myString1 = myString.substring(0, 2);
        System.out.println(myString1.toString());
        System.out.println(myString.toLowerCase());
        System.out.println(MyString.valueOf(65913));
    }
}
