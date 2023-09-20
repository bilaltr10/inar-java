package week_5._my_field;

import java.util.Scanner;

public class question_asked_by_kamıs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       /* String soru = "ınar";
        System.out.println("enter ");
        String user = input.next();
      if (user.equals("ı") || user.equals("n")|| user.equals("a") || user.equals("r")||
                user.equals("ın") || user.equals("ına")||
                user.equals("ınar") || user.equals("ar")||
                user.equals("nar") || user.equals("narı")||
                user.equals("rına") || user.equals("arın")||
                user.equals("na")  ){
            System.out.println(true);
        }
else {
            System.out.println(false);
        }*/


        String soru = "inar";
        String newInput = "";


        for (int i = soru.length() - 1; i >= 0; i--) {
            newInput += "" + (soru.charAt(i));
        }




        System.out.println("Inar in içinde var mı diye görmek için yazın ");
        String user = input.next();


        if (soru.contains(user) || (!newInput.contains(user))) {

            System.out.println("Evet var.");

        } else {
            System.out.println("hayır yok.");
        }


    }
}
