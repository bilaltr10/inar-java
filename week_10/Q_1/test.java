package week_10.Q_1;

public class test {
    public static void main(String[] args) {
        Time time = new Time();
        Time time1 = new Time(555550000);

        System.out.println(time.hour+" : "+time.minute+" : "+ time.second);
        System.out.println(time1.hour+" : "+time1.minute+" : "+ time1.second);
    }
}
