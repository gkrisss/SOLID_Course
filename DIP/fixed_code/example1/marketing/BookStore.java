package example1.marketing;

import example1.book.Book;

import java.util.List;

public class BookStore {

    private BookInventory bookInventory;
    private BookRanking bookRanking;

    public BookStore(BookInventory bookInventory, BookRanking bookRanking) {
        this.bookInventory = bookInventory;
        this.bookRanking = bookRanking;
    }

    public void displayBookInventory() {
        List<Book> books = bookInventory.getBooks();

        List<Book> rankedBooks = bookRanking.rankBooks(books);

        for (Book book: rankedBooks) {
            displayBook(book);
        }
    }

    private void displayBook(Book book) {
        System.out.printf(
                "Title: %s | Author: %s | # of pages: %d | Rating: %.1f%n",
                book.getTitle(),
                book.getAuthor(),
                book.getPages(),
                book.getRating()
        );
    }
}
