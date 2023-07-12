package warehouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductWarehouse {

    public List<Product> getProducts() {
        logProductQueryAttempt();

        CsvFileReader fileReader = new CsvFileReader();

        return fileReader.readProductsFromFile();
    }

    public void saveProductsToDatabase(List<Product> products) {
        MySQLDatabase database = new MySQLDatabase();

        for (Product product: products) {
            Map<String, String> values = new HashMap<>();

            values.put("sku", product.getSku());
            values.put("weight", String.valueOf(product.getWeight()));
            values.put("width", String.valueOf(product.getWidth()));
            values.put("length", String.valueOf(product.getLength()));
            values.put("height", String.valueOf(product.getHeight()));

            database.insert("products", values);
        }
    }

    private void logProductQueryAttempt() {
        System.out.println("INFO: Someone tried to query products");
    }
}
