package week_2.assıgnements;

import java.util.*;

public class assignement_13 {

    public static void main(String[] args) {
        Scanner bilal = new Scanner(System.in);
        System.out.println("welcome our Bank of Inar ");
        String ask;
        do {
            System.out.println("Please type yes to move forward ");
            ask = bilal.next();
               }
               while (!ask.equals("yes") );
        System.out.println("please choose a process 1-for savings 2-custumer services 3 - credit cards servces ");
        int chose = bilal.nextInt();
        switch (chose) {
            case 1:
                System.out.println("for your savings ");
                savings();
                break;
            case 2:
                System.out.println("müşteri hizmetleri ");
                break;
            case 3:
                System.out.println("Kart işlemleri");
                break;
        }
    }

    public static void savings() {
        Scanner bilal = new Scanner(System.in);

        System.out.println("please write your annual rate ");
        double annual_rate = bilal.nextDouble() / 100;
        double monthly_rate = annual_rate / 12;
        System.out.println("please enter the montly saving money");
        double monthly_saving = bilal.nextDouble();
        System.out.println("how many months  you want to  keep your money");
        int month = bilal.nextInt();
        double toplam_para=0;
       for (int i = 1; i <= month; i++) {
           toplam_para = (toplam_para + monthly_saving) * (1 + monthly_rate);

       }
        System.out.println("your savings after " + month + " month will be " +(int) (toplam_para*100)/100.0);

    }
}
