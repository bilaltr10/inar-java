package Week_13.Q_8;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ReviseMyStackClass reviseMyStackClass = new ReviseMyStackClass();

        reviseMyStackClass.push("bilal");
        reviseMyStackClass.push("topal");
        reviseMyStackClass.push("bilal1");
        reviseMyStackClass.push("topal1");
        reviseMyStackClass.push("bilal2");
        reviseMyStackClass.push("topal2");
        reviseMyStackClass.push("bilal3");
        reviseMyStackClass.push("topal3");


        ReviseMyStackClass reviseMyStackClass1 = reviseMyStackClass.clone();
        while (!reviseMyStackClass1.isEmpty()) {
            System.out.println(reviseMyStackClass1.pop());
        }

    }
}
