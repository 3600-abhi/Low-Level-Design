package org.example.decoratorDesignPattern.decoratorImpl;

import org.example.decoratorDesignPattern.baseComponent.Product;
import org.example.decoratorDesignPattern.decorator.DiscountDecorator;

public class LoyaltyDiscount extends DiscountDecorator {

    public LoyaltyDiscount(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() - 1500;
    }
}
