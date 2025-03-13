package org.example.decoratorDesignPattern.decorator;

import org.example.decoratorDesignPattern.baseComponent.Product;

public abstract class DiscountDecorator implements Product {
    protected Product product;

    public DiscountDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public double getPrice() {
        return product.getPrice();
    }
}
