package z2;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private final ArrayList<Book> books = new ArrayList<>();

    //поиск книг заданного автора
    //поиск книг, выпущенных заданным издательством
    //поиск книг, выпущенных после заданного года
    public void addBook(Book book){
        books.add(book);
    }

    public Book findAuthor(String author){

        Book authorBook = null;
        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                authorBook = book;
            }
        }
        return authorBook;
    }

    public Book findPublisher(String publisher){

        Book publisherBook = null;
        for (Book book : books) {
            if (publisher.equals(book.getPublisher())) {
                publisherBook = book;
            }
        }
        return publisherBook;
    }

    public Book findYear(int releaseYear){

        Book yearBook = null;
        for (Book book : books) {
            if (releaseYear==book.getReleaseYear()) {
                yearBook = book;
            }
        }
        return yearBook;
    }
}