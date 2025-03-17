package org.lld.observerDesignPattern.subject;

import org.lld.observerDesignPattern.observer.Observer;

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers(String videoTitle);
}
