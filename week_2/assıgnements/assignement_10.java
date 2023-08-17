package week_2.assıgnements;
import java.util.*;

public class assignement_10 {
    public static  void main (String [] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("enter the substance you want to examine" +
                " click 1 for water ;2 for iron ; 3 for metal ");
        int a = bilal.nextInt();

        switch (a) {
            case 1:
                System.out.println("water heat ");
                cümleler(a);
                break;
            case 2:
                System.out.println("ıron");
                cümleler(a);
                break;
            case 3:
                System.out.println("metal ");
                cümleler(a);
                break;
            default:
                System.out.println("please check the number entered");
                break;
        }
    }
        public static void cümleler (int a) {
            Scanner bilal = new Scanner(System.in);
            System.out.println("enter the amount of substance  in kg");
            double kg = bilal.nextDouble();
            System.out.println("enter the initial temperature ");
            double int_temp = bilal.nextDouble();
            System.out.println("enter the final temp");
            double final_temp = bilal.nextDouble();
            işlemler ( a ,kg , int_temp ,final_temp);

        }

    public static void işlemler (int a ,double x , double b , double  c ){
        switch (a){

            case 1:System.out.println("the energy needed for the water is " + x*(c-b)*4184);break;
            case 2:System.out.println("the energy needed for the iron  is " + x*(c-b)*41840);break;
            case 3:System.out.println("the energy needed for the metal is " + x*(c-b)*415884);break;
// tam istediğim gibi yapamıyorummmmmmmmmmmmmmmmm burayı

          }
        }
    }



