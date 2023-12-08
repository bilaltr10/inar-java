package week_10.Q_26;

public class test {
    public static void main(String[] args) {
        stringBuilder test = new stringBuilder("LA CASA de papel--");

        System.out.println(test.append(new stringBuilder("El profesor")));
        System.out.println(test.append(4161));
        System.out.println(test.length());
        System.out.println(test.charAt(9));
        System.out.println(test);
        System.out.println(test.substring(0,10));
      //  System.out.println("lower");
        System.out.println("lowercase:"+test.toLowerCase());

    }
}
