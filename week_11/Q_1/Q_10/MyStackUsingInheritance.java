package week_11.Q_1.Q_10;
import java.util.AbstractList;
import java.util.ArrayList;

public class MyStackUsingInheritance extends ArrayList<Object> {

 private ArrayList<Object> list = new ArrayList<>();
public boolean isEmpty() {
             return list.isEmpty();
             }

         public int getSize() {
             return list.size();
            }

         public Object peek() {
            return list.get(getSize() - 1);
            }

         public Object pop() {
             Object o = list.get(getSize() - 1);
             list.remove(getSize() - 1);
             return o;
             }

        public void push(Object o) {

     list.add(o);
             }

         @Override
 public String toString() {
            return "stack: " + list.toString();
             }
 }

