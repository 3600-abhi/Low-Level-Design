package org.example.decoratorDesign_Doubt;

public class LoyaltyDiscount implements Product {
    private Product product;

    public LoyaltyDiscount(Product product) {
      this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public double getPrice() {
        return product.getPrice() - 1500;
    }
}
