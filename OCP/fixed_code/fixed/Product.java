package fixed;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private final List<Property<?>> properties;

    public Product() {
        properties = new ArrayList<>();
    }

    public void addProperty(Property<?> property) {
        properties.add(property);
    }

    public Property<?> getProperty(String name) {
        for (Property<?> property: properties) {
            if (property.getName().equals(name)) {
                return property;
            }
        }

        throw new IllegalArgumentException("Property does not exist");
    }
}
