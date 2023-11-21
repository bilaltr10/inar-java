package week_10.Q_10;

import java.util.Arrays;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int number) {
        elements[size] = number;
        size++;
        if (size == elements.length)
            enlargeTheList();
    }


    public int dequeue() {
        int temp = elements[0];
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return temp;

    }


    public boolean empty() {
        return !(Arrays.stream(elements).sum() > 0);
    }

    public int getSize() {
        return size;
    }

    void enlargeTheList() {
        int[] list = new int[elements.length * 2];
        System.arraycopy(elements, 0, list, 0, elements.length);
        elements = list;

    }

    public int[] showTheList() {
        return elements;
    }

    public int showTheCurrentArrayLength() {

        return elements.length;
    }
    public void makeTheListDefault(){
        if(empty()){
            elements = new int[DEFAULT_CAPACITY];
        }
    }
}