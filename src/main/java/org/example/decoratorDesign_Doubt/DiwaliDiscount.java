package org.example.decoratorDesign_Doubt;

public class DiwaliDiscount implements Product {
    private final Product product;

    public DiwaliDiscount(Product product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 0.90;
    }
}
