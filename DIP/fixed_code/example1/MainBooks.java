package example1;

import example1.marketing.BookStore;
import example1.ranking.BookRanking;
import example1.storage.BookRepository;

public class MainBooks {

    public MainBooks() {
        BookStore store = new BookStore(
                new BookRepository(),
                new BookRanking()
        );

        store.displayBookInventory();
    }
}
