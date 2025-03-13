package org.example.observerPattern_Amazon_Example.subject;

import org.example.observerPattern_Amazon_Example.dtos.ProductDto;
import org.example.observerPattern_Amazon_Example.observer.Observer;

public interface Subject {
    void add(Observer observer);

    void remove(Observer observer);

    void notify(ProductDto product);
}
