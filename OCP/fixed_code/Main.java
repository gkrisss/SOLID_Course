import fixed.*;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, String> databaseFieldMapping = new TreeMap<>();

        databaseFieldMapping.put("database_whatever", "sku");
        databaseFieldMapping.put("database_weight", "weight");
        databaseFieldMapping.put("database_width", "width");
        databaseFieldMapping.put("database_height", "height");
        databaseFieldMapping.put("database_length", "length");

        ProductWarehouse warehouse = new ProductWarehouse(
                new MySQLProductPersistence(
                        "products",
                        databaseFieldMapping
                ),
                new CSVFileProductSource(
                        "./src/products.csv",
                        new RawCSVProduct()
                ),
                new ConsoleLogger()
        );

        List<Product> productList = warehouse.getProducts();

        warehouse.putProducts(productList);
    }
}
