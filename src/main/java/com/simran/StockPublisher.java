package com.simran;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StockPublisher implements IPublisher
{
    private List<ISubscriber> subscribers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockPublisher()
    {
        this.subscribers = new LinkedList<>();
    }

    @Override
    public void register(ISubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unregister(ISubscriber subscriber) {
         this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber subscriber: subscribers) {
            subscriber.update(ibmPrice,aaplPrice,googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifySubscribers();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifySubscribers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifySubscribers();
    }
}
