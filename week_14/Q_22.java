package week_14;

import java.util.ArrayList;
import java.util.Scanner;
// example of happy nums : 7 10 13 19 23 28 31 32 44 49 68 70 79 82 86 91 94 97 100 103 109 129 130 133
public class Q_22 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        int number;
        do{
            System.out.println("Enter a positive number ");
            number = input.nextInt();
        }while (number<0);

            boolean isHappy = isHappyNumber(number);

                System.out.print(number +" is"+ (isHappy? " " : " not ")+ "happy number");

        }



    public static boolean isHappyNumber(int a) {
      try {
          String s = a + "";
          int total = 0;
          for (int i = 0; i < s.length(); i++) {
              int num = s.charAt(i) - '0';
              total += (int) Math.pow(num, 2);
          }
          ArrayList<Integer> list1 = new ArrayList<>();
          list1.add(total);
          if(list1.contains(1)){
              return true;
          }
          else{
              return isHappyNumber(total);
          }
      }catch (StackOverflowError ex){
          return false;
      }



    }
}
