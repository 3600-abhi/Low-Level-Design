package org.example.decoratorDesignPattern.baseComponent;

public class BasicProduct implements Product {
    private final String name;
    private final double price;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
