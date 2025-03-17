package org.lld.observerPattern_Amazon_Example.observer;

import org.lld.observerPattern_Amazon_Example.dtos.ProductDto;
import org.lld.observerPattern_Amazon_Example.dtos.UserDto;

public class SmsObserverImpl implements Observer{
    private UserDto user;

    public SmsObserverImpl(UserDto user) {
        this.user = user;
    }

    @Override
    public void update(ProductDto product) {
        System.out.println("===========================================");
        System.out.println("SMS sent to " + user.getMobileNo());
        System.out.println("Hi " + this.user.getFirstName() + ", " + product.getProductName() + " is available now");
        System.out.println("===========================================");
    }
}
