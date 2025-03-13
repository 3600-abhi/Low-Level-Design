package org.example.observerPattern_Amazon_Example.observer;

import org.example.observerPattern_Amazon_Example.dtos.ProductDto;

public interface Observer {
    void update(ProductDto product);
}
