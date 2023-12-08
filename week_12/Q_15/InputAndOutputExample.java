package week_12.Q_15;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

//(Write/read data) Write a program to create a �le named Question_12_15.txt if it does not
//exist. Write 100 integers created randomly into the �le using text I/O. Integers are separated
//by spaces in the �le. Read the data back from the �le and display the data in increasing
//order
public class InputAndOutputExample {
    public InputAndOutputExample() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        ArrayList <String> list = new ArrayList<>();

        File file = new File("src/week_12/Q_15/Ouestion_12_15.txt");
        try {
            // FileWriter ve BufferedWriter nesnelerini oluşturun
          Scanner dosyaYazici = new Scanner(file);
      PrintWriter yazici = new PrintWriter(file);

            // Dosyaya 1'den 100'e kadar olan sayıları yazdırın
            for (int i = 1; i <= 100; i++) {
                yazici.write((Integer.toString((int) (Math.random() * 100))));
                yazici.write(" ");
            }


            // Kullanılan kaynakları serbest bırakın



            yazici.close();
            dosyaYazici.close();

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}