package z2;

public class LibraryRunner {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();

        book1.setName("Nikolay");
        book1.setAuthor("Petrov");
        book1.setPublisher("Sakha Books");
        book1.setReleaseYear(2001);

        book2.setName("Little world");
        book2.setAuthor("Henry Ford");
        book2.setPublisher("Baby Books");
        book2.setReleaseYear(1922);

        Library books = new Library();

        books.addBook(book1);
        books.addBook(book2);

        System.out.println(books.findAuthor("Petrov"));
        System.out.println(books.findPublisher("Sakha Books"));
        System.out.println(books.findYear(1922));
    }
}
