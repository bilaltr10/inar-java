package week_12.Q_26;

import jdk.dynalink.support.SimpleRelinkableCallSite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class renameTheFiles {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //Question_14_14.txt
        int first = 0;
        int second = 0;

        String option = input.next();

        if (Objects.equals(option, "*")) {
            while (first < 15) {
              if(second <10 || first<10) {
                  String eskiDosyaAdi = "Question_" + first + "_" + second + ".txt";
                  String eskiDosyaYolu = "C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_26\\" + eskiDosyaAdi;

                  String yeniDosyaAdi = "Question_0" + first + "_0" + second + ".txt";
                  String yeniDosyaYolu = "C:\\Users\\HP\\workspace\\inar-java\\src\\week_12\\Q_26\\" + yeniDosyaAdi;

                  File eskiDosya = new File(eskiDosyaYolu);
                  File yeniDosya = new File(yeniDosyaYolu);

                  boolean success = eskiDosya.renameTo(yeniDosya);

                  if (success) {
                      System.out.println("Dosya adı başarıyla değiştirildi.");
                  } else {
                      System.out.println("Dosya adı değiştirilemedi.");
                  }
              }
                first++;
                second++;
            }
        }
        }
        }







