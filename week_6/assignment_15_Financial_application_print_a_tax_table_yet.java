package week_6;

import java.util.Scanner;

public class assignment_15_Financial_application_print_a_tax_table_yet {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

      int a =  showStatus();
      double b =  taxableIncome();
        writeTopSide();
       computeTax(a,b);



    }


    public static int showStatus() {
        System.out.println("1-Single");
        System.out.println("2-Married Joint or Qualifying Widow(er");
        System.out.println("3-Married Separete");
        System.out.println("4-Head of a House");
        int status = input.nextInt();
        return status;
    }

    public static void writeTopSide() {
        System.out.printf("%s %s %s %s %s %n", "Taxable Income---", "Single---", "Married Joint or Qualifying Widow(er)---", "Married Separete---", "Head of a House");


    }

    public static double taxableIncome(){

        System.out.println("Enter your taxable income : ");
        return input.nextDouble();
    }

    public static void computeTax(int status , double taxableIncome){
        int tax  = (int) taxableIncome;

        for (int i =tax ; i <=60000; i +=50 ){
            int statusOne =(int) Math.round(i*0.0575);
            int statusTwo = (int) Math.round(i*0.075);
            int statusThree = (int) Math.round(i*0.0575);
            int statusFour = (int)Math.round(i*0.0679);

            System.out.printf("%-10d %-10d %-10d %-10d %-10d %n",i,statusOne,statusTwo,statusThree,statusFour);


        }


    }

}
