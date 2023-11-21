package week_10.Q_14;

public class MyDate {
    int year;
    int month;
    int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    MyDate(long time) {
        setDate(time);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    void setDate(long elapsedTime) {
        int totalDay = findTheTotalDay(elapsedTime);

        findTheMonth(findTheYear(totalDay));
    }

    int findTheTotalDay(long elapsedTime) {
        return (int) (elapsedTime / (1000 * 1440 * 60));
    }

    public int findTheYear(int totalDay) {
        int currentYear = 1970;
        while (totalDay > 366) {
            if ((currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0) {
                totalDay -= 366;
                currentYear++;
            } else {
                totalDay -= 365;
                currentYear++;
            }
        }
        this.year = currentYear;
        return totalDay;
    }

    public void findTheMonth(int days) {
        int[] list = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            list[1] = 29;
        }
        int i = 0;
        int month = 0;
        while (days > 31) {
            days -= list[i];
            i++;
            month++;
        }
        this.day = days + 1;
        this.month = month+1;

    }
    public String toString(){
      return  this.day+"."+this.month+"."+this.year;

    }
}
