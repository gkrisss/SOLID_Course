package fixed;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileProductSource implements ProductSource {

    private String filename;

    private RawCSVProduct rawCSVProduct;

    public CSVFileProductSource(String filename, RawCSVProduct rawCSVProduct) {
        this.filename = filename;
        this.rawCSVProduct = rawCSVProduct;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                products.add(rawCSVProduct.parseCSVLineIntoProduct(line));
            }

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return products;
    }
}
