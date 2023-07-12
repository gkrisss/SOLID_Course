package example1.storage;

import example1.book.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private String booksFile = "./src/books.csv";

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(booksFile));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] fields = line.trim().split(",");

                books.add(new Book(
                        fields[0],
                        fields[1],
                        Integer.parseInt(fields[2]),
                        Double.parseDouble(fields[3])
                ));
            }

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return books;
    }
}
