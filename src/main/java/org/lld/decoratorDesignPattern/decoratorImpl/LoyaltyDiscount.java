package org.lld.decoratorDesignPattern.decoratorImpl;

import org.lld.decoratorDesignPattern.baseComponent.Product;
import org.lld.decoratorDesignPattern.decorator.DiscountDecorator;

public class LoyaltyDiscount extends DiscountDecorator {

    public LoyaltyDiscount(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() - 1500;
    }
}
