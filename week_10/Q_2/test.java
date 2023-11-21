package week_10.Q_2;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        BMI person1 = new BMI("ALİ", 28,200,5,74);


        System.out.println(person1.findTheBMI() + " " + person1.BMIInterpretation());

    }
}
