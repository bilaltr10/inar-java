package week_10.Q_23;

public class test {
    public static void main(String[] args) {
        MyString2 test = new MyString2("Alihanımm");
        System.out.println(test.compare("alihanım"));
        System.out.println(test.toUpperCase());
        System.out.println(test.substring(5));
        char[] ch = test.toChars();
        for (char a : ch) {
            System.out.print(a + " ");
        }

        System.out.println("\n"+MyString2.valueOf(test.substring(5) == test.toUpperCase()));

    }
}
