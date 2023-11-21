package week_10.Q_1;

import java.util.Date;

public class Time {

    int hour;
    int minute;
    int second;


    Time() {
        this(System.currentTimeMillis());

    }

    Time(long time) {
        elapseTime(time);
    }

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void elapseTime(long elapseTime) {
        this.second = (int) (elapseTime / 1000 % 60);
        this.minute = (int) (elapseTime / (1000 * 60) % 60);
        this.hour = (int) (elapseTime / (1000 * 60 * 60) % 24)+3;

    }


}
