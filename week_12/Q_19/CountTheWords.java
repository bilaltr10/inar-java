package week_12.Q_19;

import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a URL: ");

     //   String URLString = scanner.next();
        //String URLString = new Scanner(System.in).next()
String URLString = "https://en.wikipedia.org/wiki/The_Cranberries";
        try {
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}


