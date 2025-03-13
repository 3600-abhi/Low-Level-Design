package org.example.observerDesignPattern.subject;

import org.example.observerDesignPattern.observer.Observer;

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers(String videoTitle);
}
