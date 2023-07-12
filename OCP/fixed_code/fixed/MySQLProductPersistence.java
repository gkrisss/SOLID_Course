package fixed;

import java.util.List;
import java.util.Map;

public class MySQLProductPersistence implements ProductPersistence {

    private String tableName;
    private final Map<String, String> productFieldToDatabaseFieldMapping;

    public MySQLProductPersistence(
            String tableName,
            Map<String, String> productFieldToDatabaseFieldMapping
    ) {
        this.tableName = tableName;
        this.productFieldToDatabaseFieldMapping = productFieldToDatabaseFieldMapping;
    }

    @Override
    public void saveProducts(List<Product> products) {
        // imagine this is actually SQL code here

        for (Product product: products) {
            System.out.printf("Inserting into %s table: ", tableName);

            for (Map.Entry<String, String> fieldMapping: productFieldToDatabaseFieldMapping.entrySet()) {
                System.out.printf(
                        "%s=%s ",
                        fieldMapping.getKey(),
                        String.valueOf(product.getProperty(fieldMapping.getValue()).getValue())
                );
            }

            System.out.println();
        }

        System.out.println();
    }
}
