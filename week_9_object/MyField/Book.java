package week_9_object.MyField;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.Locale;

public class Book {

    private String nameOfBook;
    private String writer;
    private int numberOfPages;
    private int publishedYear;
    static int numberOfBooks;
    int romantic = 0;
    int history = 0;
    int science = 0;
    String genre;

    Book(String nameOfBook, String writer, int numberOfPages, int publishedYear, String genre) {
        this.nameOfBook = nameOfBook;
        this.writer = writer;
        this.numberOfPages = numberOfPages;
        this.publishedYear = publishedYear;
        numberOfBooks++;
        this.genre = setNumberOfBooksForTheirGenre(genre);
    }

    String getNameOfBook() {
        return nameOfBook;
    }

    String getWriter() {
        return writer;
    }

    int getNumberOfPages() {
        return numberOfPages;
    }

    int getPublishedYear() {
        return publishedYear;
    }


    String setNumberOfBooksForTheirGenre(String genre) {
        genre = genre.toUpperCase(Locale.ROOT);

        if (genre.equals("ROMANTIC")) {
            romantic++;
        } else if (genre.equals("HISTORY")) {
            history++;
        } else if (genre.equals("SCIENCE")) {
            science++;
        }
        return genre;
    }

    public void kitapBilgileriGoster() {
        System.out.println("Kitap Adı: " + nameOfBook);
        System.out.println("Yazar: " + writer);
        System.out.println("Sayfa Sayısı: " + numberOfPages);
        System.out.println("Yaımlandığı yıl :" + publishedYear);
        System.out.println("Genre : " + genre);
    }

}
