package org.lld.decoratorDesign_Doubt;

public class DecoratorDoubtExample {
    public static void main(String[] args) {
        Product laptop = new BasicProduct("Lenovo Thinkpad", 50000);

        laptop = new DiwaliDiscount(laptop);
        laptop = new LoyaltyDiscount(laptop);

        System.out.println(laptop.getPrice());
    }
}
