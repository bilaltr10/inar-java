package week_5.assignements_WEEK5;
//(Find numbers divisible by 5 or 6, but not both) Write a program that displays all the
//numbers from 100 to 200, ten per line, that are divisible by 5 or 6, but not both. Numbers are
//separated by exactly one space.
public class assignement_11_divisible_by_5_6_not_both {
    public static void main(String[] args) {
        int atTenToDown=0;
        for ( int i = 100; i<=200 ; i++){

            if ( i%5==0 ^ i%6==0){
                System.out.print(i+ " ");
atTenToDown++;
            }
            if ( atTenToDown==10){
                System.out.println();
                atTenToDown=0;
            }
        }

    }
}
