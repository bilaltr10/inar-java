package week_14.Q_9;

import week_14.Q_8.Myqueue;

public class test {
    public static void main(String[] args) {

        MyQueue myqueue = new MyQueue();
        myqueue.push(3);
        myqueue.push(4);
        myqueue.push(5);
        myqueue.push(6);
        myqueue.push(7);
        myqueue.push(8);
        myqueue.push(9);
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
