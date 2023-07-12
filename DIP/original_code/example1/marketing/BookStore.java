package example1.marketing;

import example1.book.Book;
import example1.ranking.BookRanking;
import example1.storage.BookRepository;
import java.util.List;

public class BookStore {

    private BookRepository bookRepository;
    private BookRanking bookRanking;

    public BookStore(BookRepository bookRepository, BookRanking bookRanking) {
        this.bookRepository = bookRepository;
        this.bookRanking = bookRanking;
    }

    public void displayBookInventory() {
        List<Book> books = bookRepository.getAllBooks();

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
