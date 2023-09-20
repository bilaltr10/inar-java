package week_5._my_field;

import java.util.Scanner;

public class nasıl_kafiye {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int sayı = 0;
        System.out.print("bir şiir satırı girin ");
        String first_line = input.nextLine().trim();
        System.out.print("bir şiir satırı girin ");
        String second_line = input.nextLine().trim();
        System.out.print("bir şiir satırı girin ");
        String third_line = input.nextLine().trim();
        System.out.print("bir şiir satırı girin ");
        String forth_line = input.nextLine().trim();


        for (i = 0; i < first_line.length(); i++) {
            if (first_line.charAt(i) == ' ') {
                sayı = i;
            }
        }

        String first = first_line.substring(sayı);
        sayı = 0;

        for (i = 0; i < second_line.length(); i++) {
            if (second_line.charAt(i) == ' ') {
                sayı = i;
            }
        }
        String second = second_line.substring(sayı);
        sayı = 0;

        for (i = 0; i < third_line.length(); i++) {
            if (third_line.charAt(i) == ' ') {
                sayı = i;
            }
        }
        String three = third_line.substring(sayı);
        sayı = 0;

        for (i = 0; i < forth_line.length(); i++) {
            if (forth_line.charAt(i) == ' ') {
                sayı = i;
            }
        }
        String forth = forth_line.substring(sayı);

        String[] array = new String[]{first, second, three, forth};

          for (String a : array){
              System.out.println(a+"  ");
          }


            }
        }


