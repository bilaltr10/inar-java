package week_5.assignements_WEEK5;

import java.util.Scanner;

public class assignement_25_find_PI_number_given_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter a value for PI");
        int user = input.nextInt();
        boolean a = true ;
      double total = 0;
      int sayaç = 0 ;
        for ( int i =1 ; i<user ; i = 2+i){

          if ( sayaç %2 ==0 ){
              total += 1.0/i;
          }
            else {
                total += (-1)*(1.0/i);
          }

            sayaç++;
        }
        System.out.printf("PI value for i  = %d : %.15f",user,4*total);
    }
}
