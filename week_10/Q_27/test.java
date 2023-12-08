package week_10.Q_27;

public class test {
    public static void main(String[] args) {
       char [] chars = new String("bilal").toCharArray();
        stringBuilder2 str = new stringBuilder2(chars);
        System.out.println(str.insert(3, new stringBuilder2("fenerbahçe")));
    }
}
