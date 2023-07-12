package fixed;

import java.util.List;

public class ProductWarehouse {

    private ProductPersistence productPersistence;
    private ProductSource productSource;

    private Logger logger;

    public ProductWarehouse(
            ProductPersistence productPersistence,
            ProductSource productSource,
            Logger logger
    ) {
        this.productPersistence = productPersistence;
        this.productSource = productSource;
        this.logger = logger;
    }

    public List<Product> getProducts() {
        logger.info("INFO: Someone tried to query products");

        return productSource.getProducts();
    }

    public void putProducts(List<Product> products) {
        productPersistence.saveProducts(products);
    }
}
