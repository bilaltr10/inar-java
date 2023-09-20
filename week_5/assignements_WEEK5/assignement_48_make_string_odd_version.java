package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_48_make_string_odd_version {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string :");
        String inputOfUser = input.nextLine();
        String oddVersionOfInputOfUser = "";
        for ( int i =0; i <inputOfUser.length(); i++){

            if (i %2 ==0){
                oddVersionOfInputOfUser +=inputOfUser.charAt(i);
            }

        }
        System.out.println(oddVersionOfInputOfUser);
    }
}
