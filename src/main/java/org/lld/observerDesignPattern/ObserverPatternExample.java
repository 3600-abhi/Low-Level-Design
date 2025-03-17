package org.lld.observerDesignPattern;

import org.lld.observerDesignPattern.observer.Observer;
import org.lld.observerDesignPattern.observer.User;
import org.lld.observerDesignPattern.subject.Subject;
import org.lld.observerDesignPattern.subject.YoutubeChannel;

public class ObserverPatternExample {
    public static void main(String[] args) {
        Subject youtubeChannel = new YoutubeChannel("Code with Abhishek");

        Observer user1 = new User("Vikash Jaiswal");
        Observer user2 = new User("Prashant Jaiswal");

        youtubeChannel.subscribe(user1);
        youtubeChannel.subscribe(user2);

        ((YoutubeChannel) youtubeChannel).uploadVideo("Learn complete LLD");
    }
}
