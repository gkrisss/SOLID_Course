package example1.ranking;

import example1.book.Book;

import java.util.Comparator;
import java.util.List;

public class BookRanking {

    public List<Book> rankBooks(List<Book> books) {
        return books
                .stream()
                .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                .toList();
    }
}
