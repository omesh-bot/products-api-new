// A PhysicalProduct IS-A Product because it represents a physical, tangible item sold in the shop that inherits all core product attributes (id, name, price).
// A ShoppingCart is NOT a Product because it HAS-A list of products (composition) rather than being a product itself.

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    // no-arg constructor for Jackson
    public PhysicalProduct() {
    }

    // full constructor: first line must be super(id, name, price)
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
