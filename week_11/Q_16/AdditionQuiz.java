package week_11.Q_1.Q_16;
import java.util.ArrayList;
import java.util.Scanner;
public class AdditionQuiz {



 public static void main(String[] args) {
            int number1 = (int)(Math.random() * 10);
             int number2 = (int)(Math.random() * 10);
     ArrayList<Integer> list = new ArrayList<>();
             // Create a Scanner
            Scanner input = new Scanner(System.in);

             System.out.print(
                     "What is " + number1 + " + " + number2 + "? ");
             int answer = input.nextInt();

             while (number1 + number2 != answer) {

                 System.out.print("Wrong answer. Try again. What is "
                         + number1 + " + " + number2 + "? ");
                list.add(answer);
                 answer = input.nextInt();
                 if(list.contains(answer)){
                     System.out.println("you have already entered "+ answer);
                 }
                 }
             System.out.println("You got it!");
            }
}
