package week_9_object.MyField;

import java.util.Scanner;

public class bookTestOf_useObjectINForeach {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Book [] books = new Book[5];
        books[0]= new Book("Alıce", "Jo jo Kıng", 124, 1998,"romantıc");
        books[1]= new Book("Alıce", "Jo jo Kıng", 124, 1998,"romantıc");
        books[2]= new Book("Alıce", "Jo jo Kıng", 124, 1998,"romantıc");
        books[3]= new Book("Alıce", "Jo jo Kıng", 124, 1998,"romantıc");
        books[4]= new Book("Alıce", "Jo jo Kıng", 124, 1998,"romantıc");

        for(Book book: books){
            book.kitapBilgileriGoster();
            System.out.println("*********************");
        }
    }
}
