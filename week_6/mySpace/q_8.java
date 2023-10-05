package week_6.mySpace;

import java.util.Scanner;

//Design a Java function to determine whether one string is a rotation of
// another string, considering rotation by any number of characters.
public class q_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        String str2 = input.next();
        System.out.print(str1 + " is ");


        if (haveSameLength(str1, str2)) {
            if (haveSameLetters(str1, str2)) {
                if (isRotation(str1, str2)) {
                    System.out.print("");
                }else{
                    System.out.print("not ");
                }
            }else{
                System.out.print("not ");
            }
        }else{
            System.out.print("not ");
        }

        System.out.print("rotation of " +str2 );
    }

    public static boolean haveSameLength(String str1, String str2) {
        return str1.length() == str2.length();


    }

    public static boolean haveSameLetters(String str1, String str2) {

        for (int i = 0; i <str1.length() ; i++) {
            if(!(str2.contains(Character.toString(str1.charAt(i))))){
                return false;
            }
        }
        return true;

    }

    public static boolean isRotation(String str1, String str2) {

        for (int i = 0, m = str1.length() - 1; i < str1.length(); i++, m--) {
            if (!(str1.charAt(i) == str2.charAt(m))) {
                return false;
            }
        }
        return true;
    }
}




