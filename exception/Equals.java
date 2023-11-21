package exception;

public class Equals {

    int a;

    Equals() {
        this(2);
    }

    Equals(int m) {
        this.a = m;
    }

    public boolean Equal(int m) {
        return a==m;
    }

    public boolean Equal(Equals m) {
        return m.equals(a);
    }
}

