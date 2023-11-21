package exception;

import week_11.Q_1.Q_11.SortArrayList;

import java.util.Scanner;

public class exceptionInTheSheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //ArithmeticException yazınca throws istemedi metot isminde ama Exception da istedi neden ?


        try{
            int result = divide(num1,num2);
            System.out.println("result : " + result);
        }catch(Exception ex){
            System.out.println("Exception : Divisor can not be zero" );
            System.out.println("Exception : "+ ex.getMessage());
            System.out.println("Exception : "+ex);
        }
        System.out.println("Execution contiues...");
    }
    public static int divide(int num1 , int num2) throws Exception {
        if (num2==0){
            throw new Exception("Divisor cannot be zero");
        }
        return num1/num2;
    }
}
