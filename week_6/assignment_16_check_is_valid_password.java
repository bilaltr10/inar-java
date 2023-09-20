package week_6;

import java.util.Locale;
import java.util.Scanner;

public class assignment_16_check_is_valid_password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//input
        System.out.print("Enter a password:");
        String password = input.next();
        if (isValid(password)) {

            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }

    public static boolean isValid(String password) {
        password = password.toLowerCase(Locale.ROOT);
        // A password must have at least eight characters
        if (password.length() < 8) {
            return false;
        }
        // A password consists of only letters and digits.
//isDigit veya isLetter de kullanılabilir
        for (int i = 0; i < password.length(); i++) {

            if (!(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'
                    ||( password.charAt(i) >= '0' && password.charAt(i) <= '9'))) {
                return false;
            }
        }

// password must contain at least two digits.
      int count =0;
        for ( int i =0; i<password.length(); i++){

            if ( password.charAt(i)>='0' && password.charAt(i)<='9'){
                count++;
            }

        }
        if (count<2){
            return false;
        }


        return true;
    }


}
