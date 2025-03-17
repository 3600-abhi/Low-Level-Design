package org.lld.observerPattern_Amazon_Example.subject;

import org.lld.observerPattern_Amazon_Example.dtos.ProductDto;
import org.lld.observerPattern_Amazon_Example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ProductSubject implements Subject {
    private final List<Observer> observerList;
    private ProductDto product;

    public ProductSubject() {
        this.observerList = new ArrayList<>();
    }

    public void setProduct(ProductDto product) {
        System.out.println("prev count : " + (this.product != null ? this.product.getProductQuantity() : "-"));
        System.out.println("curr count : " + (product != null ? product.getProductQuantity() : "0"));

        if (this.product == null || (this.product.getProductQuantity() == 0 && product != null && product.getProductQuantity() > 0)) {
            notify(product);
        }

        if(this.product == null) {
            this.product = new ProductDto();
        }

        this.product.setProductQuantity(product.getProductQuantity());
        this.product.setProductName(product.getProductName());
        this.product.setProductDescription(product.getProductDescription());
    }

    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notify(ProductDto product) {
        for (Observer observer : this.observerList) {
            observer.update(product);
        }
    }
}
