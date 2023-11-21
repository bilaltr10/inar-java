package week_11.Q_1.Q_10;

import java.util.ArrayList;
import java.util.Collections;

public class Stack {
    public static void main(String[] args) {
        MyStackUsingInheritance stack = new MyStackUsingInheritance();
int [] list =new int[]{1,5,7,14};

        stack.push(0);
        stack.push("veli");
        stack.push(15);
        stack.push("Deniz");
        stack.push(45);

        System.out.println("Stack : "+stack.toString());

        System.out.println("Displaying them in reverse order");
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }


    }
}




