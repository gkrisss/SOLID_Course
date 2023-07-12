package fixed;

public class RawCSVProduct {

    public Product parseCSVLineIntoProduct(String line) {
        String[] values = line.trim().split(",");

        Product product = new Product();

        product.addProperty(new Property<>("sku", values[0]));
        product.addProperty(new Property<>("weight", Double.parseDouble(values[1])));
        product.addProperty(new Property<>("width", Double.parseDouble(values[2])));
        product.addProperty(new Property<>("height", Double.parseDouble(values[3])));
        product.addProperty(new Property<>("length", Double.parseDouble(values[4])));

        return product;
    }
}
