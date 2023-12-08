package week_12.Q_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFromfile_Q_22 {
    public static void main(String[] args) throws FileNotFoundException {
        String targetedFile = "C:/Users/HP/workspace/inar-java/src/week_12/Q_22/names.txt";
        String target = "C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_22\\names.txt";

        double totalSalaryOfFullProfessor = 0;
        double totalSalaryOfAssociateProf = 0;
        double totalSalaryOfAssistantProf = 0;

        int numberOfFullProf = 0;
        int numberOfAssociateProf = 0;
        int numberOfAssistantProf = 0;

        try (Scanner scanner = new Scanner(new File(targetedFile))) {

            while (scanner.hasNext()) {
                String name = scanner.next();
                String surname = scanner.next();
                String post = scanner.next();
                String salaryString = scanner.next();
                double double_salary = Double.parseDouble(salaryString.replace(",", "."));
                switch (post) {
                    case "full" -> {
                        numberOfFullProf++;
                        totalSalaryOfFullProfessor += double_salary;
                    }
                    case "assistant" -> {
                        numberOfAssistantProf++;
                        totalSalaryOfAssistantProf += double_salary;
                    }
                    case "associate" -> {
                        numberOfAssociateProf++;
                        totalSalaryOfAssociateProf += double_salary;
                    }
                }
            }
        }

        System.out.println("Number of full professor : " + numberOfFullProf);
        System.out.println("Total salary of full professors:  " + totalSalaryOfFullProfessor);
        System.out.println("Average wage of full prof :  " + totalSalaryOfFullProfessor / numberOfFullProf);
        System.out.println("\nNumber of associate professor : " + numberOfAssociateProf);
        System.out.println("Total salary of  associate professors:  " + totalSalaryOfAssociateProf);
        System.out.println("Average wage of associate prof :  " + totalSalaryOfAssociateProf / numberOfAssociateProf);
        System.out.println("\nNumber of assistant professor : " + numberOfAssistantProf);
        System.out.println("Total salary of assistant professors:  " + totalSalaryOfAssistantProf);
        System.out.println("Average wage of assistant prof :  " + totalSalaryOfAssistantProf / numberOfAssistantProf);
        System.out.println("************************************");
        System.out.println("Number of total personel : " + (numberOfAssociateProf + numberOfAssistantProf + numberOfFullProf));
    }
}
