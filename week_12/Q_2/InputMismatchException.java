package week_12.Q_2;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        var isim = "isim";

        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        int num1 = 0;
        int num2 = 0;
        do {
            try {
                System.out.println("Enter two integers to sum ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                isValid = true;
            } catch (Exception ex) {
                System.out.println("Nonnumeric operand : " + ex);
                System.out.println("Wrong input !! Please enter integer");
                input.nextLine();
            }

        } while (!isValid);
        System.out.println("Sum of " + num1 + " + " + num2 + " is " + (num1 + num2));

    }


    // girilen değeri yazdırmak istiyorum ama mesela c girilmiş --> " nonnumeric value :c "yi nasıl yazdırabilirim
}
