package week_12.Q_25;

import java.io.File;
import java.util.Scanner;

/*(Create a directory) Write a program that prompts the user to enter a directory name and
creates a directory using the File’s mkdirs method. The program displays the message
“Directory created successfully” if a directory is created or “Directory already exists” if the
directory already exists*/
public class Create_A_Directory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Write a directory name to create : ");
        String nameOfDirectory = input.nextLine();


        File file = new File(nameOfDirectory);
       if(file.exists()){
           System.out.println("Directory already exists");
       }
       else{
           file.mkdir();
           System.out.println("Directory created successfully");
       }
    }
}
