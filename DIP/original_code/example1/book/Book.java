package example1.book;

public class Book {

    private String title;
    private String author;
    private int pages;
    private double rating;

    public Book(String title, String author, int pages, double rating) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
