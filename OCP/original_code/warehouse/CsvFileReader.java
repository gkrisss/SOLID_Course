package warehouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {

    private String filename = "./src/products.csv";

    public List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] values = line.trim().split(",");

                products.add(new Product(
                        values[0],
                        Double.parseDouble(values[1]),
                        Double.parseDouble(values[2]),
                        Double.parseDouble(values[3]),
                        Double.parseDouble(values[4])
                ));
            }

            reader.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return products;
    }
}
