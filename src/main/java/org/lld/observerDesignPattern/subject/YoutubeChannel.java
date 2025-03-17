package org.lld.observerDesignPattern.subject;

import org.lld.observerDesignPattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {
    private final String channelName;
    private final List<Observer> observerList = new ArrayList<>();

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer observer : observerList) {
            observer.update(this.channelName, videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(this.channelName + " uploaded : " + videoTitle);
        notifyObservers(videoTitle);
    }
}
