package week_14.Q_8;

import java.util.LinkedList;
import java.util.Queue;

public class Myqueue {

    Queue<Integer> firstList = new LinkedList<>();
    Queue<Integer> secondList = new LinkedList<>();

    int size = 0;

    //void push(int x) Pushes element x to the top of the stack.
    public void push(int number) {

        while (!firstList.isEmpty()) {
            secondList.offer(firstList.poll());
        }

        firstList.offer(number);
        size++;
        while (!secondList.isEmpty()) {
            firstList.offer(secondList.poll());
        }
    }

    //int pop() Removes the element on the top of the stack and returns it.

    public int pop() throws NullPointerException{
            int a = firstList.peek();
            firstList.remove(a);
            size--;
            return a;
          }

    //  int top() Returns the element on the top of the stack.
    public int top() {
        return firstList.peek();
    }

    //boolean empty() Returns true if the stack is empty, false otherwise.

    public boolean empty() {
        return firstList.isEmpty();
    }

}
