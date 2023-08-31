package week_3.assignements;

import java.util.*;
//Write a program that randomly generates an addition question with
//two integers less than 100 and displays to the user a question such as “What is 9 - 2?” After
//the user enters the answer, the program displays a message indicating whether it is correct.

public class assignement_10 {
    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);

        int firstPointsOfUser = 100;
        int lastPointOfUser = 0;
        String yes;
        do {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            System.out.println("What is " + firstNumber + " + " + secondNumber);
            int answerOfUser = bilal.nextInt();
            int answerOfPc = firstNumber + secondNumber;

            if (answerOfPc == answerOfUser) {
                System.out.println("Yes your answer is correct");
                firstPointsOfUser += 50;
            } else {
                System.out.println("Your answer is wrong  it should be -->" + answerOfPc);
                firstPointsOfUser -= 50;
            }
            if (firstPointsOfUser == 0) {
                System.out.println("Üzgünüz hiç puanınız kalmadı ");
                break;
            } else {
                System.out.println("Şu an ki puanınız -->" + firstPointsOfUser);
                System.out.println("Çıkmak istiyorsanız N' ye basınız devam etmek için klavyeden N hariç bir tuşa basın ");
                yes = bilal.next();
            }
        } while (!yes.equals("n"));
        System.out.println("Matematikle kalın ");
    }
}
