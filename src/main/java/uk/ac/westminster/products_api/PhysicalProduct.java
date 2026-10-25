package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }
    // A PhysicalProduct IS-A Product because it is still something the shop sells, with an id, name and price; it just adds shipping details.
    // A ShoppingCart would NOT pass this test: a cart is not a product, it HAS products (composition, so it holds a List<Product> field).
    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

}
