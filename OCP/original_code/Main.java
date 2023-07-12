import warehouse.Product;
import warehouse.ProductWarehouse;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductWarehouse warehouse = new ProductWarehouse();

        List<Product> products = warehouse.getProducts();

        warehouse.saveProductsToDatabase(products);
    }
}
