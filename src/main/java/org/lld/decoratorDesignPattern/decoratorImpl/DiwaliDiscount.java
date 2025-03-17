package org.lld.decoratorDesignPattern.decoratorImpl;

import org.lld.decoratorDesignPattern.baseComponent.Product;
import org.lld.decoratorDesignPattern.decorator.DiscountDecorator;

public class DiwaliDiscount extends DiscountDecorator {

    public DiwaliDiscount(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 0.90;
    }
}
