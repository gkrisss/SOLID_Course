package warehouse;

public class Product {

    private String sku;
    private double weight;
    private double width;
    private double length;
    private double height;

    public Product(String sku, double weight, double width, double length, double height) {
        this.sku = sku;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double getWidth() {
        return width;
    }

    public String getSku() {
        return sku;
    }
}
