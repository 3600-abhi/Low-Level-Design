package org.example.decoratorDesignPattern.decoratorImpl;

import org.example.decoratorDesignPattern.baseComponent.Product;
import org.example.decoratorDesignPattern.decorator.DiscountDecorator;

public class DiwaliDiscount extends DiscountDecorator {

    public DiwaliDiscount(Product product) {
        super(product);
    }

    @Override
    public double getPrice() {
        return product.getPrice() * 0.90;
    }
}
