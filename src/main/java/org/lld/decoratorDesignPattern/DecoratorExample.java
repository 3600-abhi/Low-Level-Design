package org.lld.decoratorDesignPattern;

import org.lld.decoratorDesignPattern.baseComponent.BasicProduct;
import org.lld.decoratorDesignPattern.baseComponent.Product;
import org.lld.decoratorDesignPattern.decoratorImpl.DiwaliDiscount;
import org.lld.decoratorDesignPattern.decoratorImpl.LoyaltyDiscount;

public class DecoratorExample {
    public static void main(String[] args) {
        Product laptop = new BasicProduct("Lenovo Thinkpad", 50000);

        laptop = new DiwaliDiscount(laptop);
        System.out.println("Diwali Price : " + laptop.getPrice());

        laptop = new LoyaltyDiscount(laptop);
        System.out.println("Loyalty Price : " + laptop.getPrice());
    }
}
