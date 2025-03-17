package org.lld.observerPattern_Amazon_Example;

import org.lld.observerPattern_Amazon_Example.dtos.ProductDto;
import org.lld.observerPattern_Amazon_Example.dtos.UserDto;
import org.lld.observerPattern_Amazon_Example.observer.Observer;
import org.lld.observerPattern_Amazon_Example.observer.EmailObserverImpl;
import org.lld.observerPattern_Amazon_Example.observer.SmsObserverImpl;
import org.lld.observerPattern_Amazon_Example.subject.ProductSubject;

public class AmazonNotifyExample {
    public static void main(String[] args) {
        UserDto user1 = new UserDto();
        user1.setUserId("1");
        user1.setFirstName("Vikash");
        user1.setEmail("jaiswal10.vikash@gmail.com");
        Observer userObserber1 = new EmailObserverImpl(user1);

        UserDto user2 = new UserDto();
        user2.setUserId("2");
        user2.setFirstName("Prashant");
        user2.setMobileNo("9983938812");
        Observer userObserber2 = new SmsObserverImpl(user2);

        ProductDto product = new ProductDto();
        product.setProductId("apple_iphone_16_pro_max_123@#");
        product.setProductName("Iphone 16 Pro Max");


        ProductSubject productSubject = new ProductSubject();
        productSubject.add(userObserber1);
        productSubject.add(userObserber2);


        product.setProductQuantity(12);
        productSubject.setProduct(product);
        product.setProductQuantity(0);
        productSubject.setProduct(product);
        product.setProductQuantity(100);
        productSubject.setProduct(product);


    }
}
