package week_14.Q_8;

import java.util.Queue;

public class test {
    public static void main(String[] args) {

        Myqueue myqueue = new Myqueue();

        myqueue.push(15);
        myqueue.push(16);
        myqueue.push(17);
        myqueue.push(18);
        myqueue.push(19);
        myqueue.push(20);
        myqueue.push(21);
        try {
            System.out.println("top() : " + myqueue.top());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("empty() : " + myqueue.empty());
            System.out.println("top() : " + myqueue.top());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
            System.out.println("pop() : " + myqueue.pop());
        } catch (NullPointerException e) {
            System.out.println("oopppss ! indis değeri negatif olamaz");
        }
    }
}
