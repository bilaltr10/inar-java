package week_6.mySpace;

import java.util.*;

//assess your password

public class q_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password");
        String password = input.next();
        int degree = checkYourPassword(password);
        System.out.print("Your password is ");
        if (degree >= 16) {
            System.out.println("so powerful");
        } else if (degree >= 13) {
            System.out.println("powerful");
        } else if (degree >= 10) {
            System.out.println("middle");

        } else if (degree > 8) {
            System.out.println("low");

        } else System.out.println("very low");

    }


    public static int checkYourPassword(String str) {
        System.out.println("Length : "+length(str));
        System.out.println("bit letter :"+BigLetters(str));
        System.out.println("Small letter : "+smallLetters(str));
        System.out.println("digits : "+digits(str));
        System.out.println("Characters : "+characters(str));
        return length(str) + BigLetters(str) + smallLetters(str) + digits(str) + characters(str);
    }

    public static int BigLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        if (count > 3) {
            return 3;
        } else if (count >= 1) {
            return 2;
        } else {
            return 0;
        }

    }


    public static int length(String str) {

        if (str.length() > 10) {
            return 7;
        } else if (str.length() > 7) {
            return 3;
        } else if (str.length() > 5) {
            return 1;
        } else {
            return 0;
        }
    }


    public static int smallLetters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        if (count > 3) {
            return 3;
        } else if (count >= 1) {
            return 2;
        } else {
            return 0;
        }

    }

    public static int characters(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 33 && str.charAt(i) <= 47) ||
                    (str.charAt(i) >= 58 && str.charAt(i) <= 64) ||
                    (str.charAt(i) >= 91 && str.charAt(i)  <= 96) ||
                    (str.charAt(i)>= 123 && str.charAt(i)<=126)) {
                count++;
            }
        }
        if (count > 3) {
            return 3;
        } else if (count >= 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int digits(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        if (count > 3) {
            return 3;
        } else if (count >= 1) {
            return 2;
        } else {
            return 0;
        }

    }


}

