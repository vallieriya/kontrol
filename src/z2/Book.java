package z2;

public class Book {
    //Свойства: название, автор, издательство, год издания, количество страниц, цена, тип переплета.
    private String name;
    private String author;
    private String publisher;
    private int releaseYear;
    private int totalPages;
    private double price;
    private boolean isHard;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHard(boolean hard) {
        isHard = hard;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String toString() {
        return "Book " +
                "name is " + name +
                ", author: " + author + ". Published by " + publisher + " in " + releaseYear;
    }
}