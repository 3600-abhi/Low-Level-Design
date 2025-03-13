package org.example.observerDesignPattern.observer;

public class User implements Observer {
    private final String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Hey " + this.username + " " + channelName + " uploaded new video " + videoTitle);
    }
}
