package example1.ranking;

import example1.book.Book;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookRanking implements example1.marketing.BookRanking {

    @Override
    public List<Book> rankBooks(List<Book> books) {
        return books
                .stream()
                .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                .collect(Collectors.toList());
    }
}
