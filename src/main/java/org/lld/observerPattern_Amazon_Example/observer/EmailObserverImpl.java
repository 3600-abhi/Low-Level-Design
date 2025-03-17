package org.lld.observerPattern_Amazon_Example.observer;

import org.lld.observerPattern_Amazon_Example.dtos.ProductDto;
import org.lld.observerPattern_Amazon_Example.dtos.UserDto;

public class EmailObserverImpl implements Observer {
    private UserDto user;

    public EmailObserverImpl(UserDto user) {
        this.user = user;
    }

    @Override
    public void update(ProductDto product) {
        System.out.println("===========================================");
        System.out.println("Email sent to " + user.getEmail());
        System.out.println("Hi " + this.user.getFirstName() + ", " + product.getProductName() + " is available now");
        System.out.println("===========================================");
    }
}
