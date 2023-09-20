package week_4.assignements;
import java.util.*;
public class assignement_23_With_Different_Methods {
    public static void main(String[] args) {
inputsOfEmployee();

    }

public static void inputsOfEmployee() {
    Scanner bilal = new Scanner(System.in);
    System.out.print("Enter employees name : ");
    String nameAndSurname = bilal.nextLine().toUpperCase();
    System.out.print("Enter number of hours worked in a week : ");
    double numberOfHoursPerWeek = bilal.nextDouble();
    System.out.print("Enter hourly pay rate : ");
    double hourlyPayRate = bilal.nextDouble();
    System.out.print("Enter federal tax withholding rate : ");
    double federalTax = bilal.nextDouble();
    System.out.print("Enter state tax  withholding rate :  ");
    double stateTax = bilal.nextDouble();
outputOfEmployee(nameAndSurname,numberOfHoursPerWeek,hourlyPayRate,federalTax,stateTax);
    }

public static void outputOfEmployee(String nameAndSurname ,double numberOfHoursPerWeek,double hourlyPayRate,double federalTax , double stateTax){

    System.out.println("Employee's Name : "+ nameAndSurname);
    System.out.println("Hours Worked : " + numberOfHoursPerWeek);
    System.out.println("Pay Rate : $"+hourlyPayRate);
    System.out.println("Gross Pay :"+ numberOfHoursPerWeek*hourlyPayRate);
deductions ( numberOfHoursPerWeek*hourlyPayRate,federalTax,stateTax);
}
public static void deductions(double grosspay, double federalTax , double stateTax){
    System.out.println("Deductions");
    double federalWithholding=(grosspay*Math.round(federalTax*100))/100.0;
    System.out.println("    Federal Withholding  %"+Math.round(federalTax*100) +" : " +federalWithholding);
    double stateWithholding =  (grosspay*Math.round(stateTax*100))/100.0;
    System.out.println("    State Withholding  %"+ Math.round(stateTax*100)+" : "+stateWithholding);
    double totalDeduction =federalWithholding+stateWithholding;
    System.out.println("    Total Deduction : " +totalDeduction);
    System.out.println("Net Pay weekly :"+(grosspay-totalDeduction));
    System.out.println("Net Pay montky :"+(grosspay-totalDeduction) * 4);
    }

}
