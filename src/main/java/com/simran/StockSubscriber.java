package com.simran;

import java.util.UUID;

public class StockSubscriber implements ISubscriber
{
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private String id;
    private IPublisher publisher;

    public StockSubscriber(IPublisher publisher)
    {
       this.id = UUID.randomUUID().toString();
       this.publisher = publisher;
       this.publisher.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice)
    {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "ibmPrice=" + ibmPrice +
                ", aaplPrice=" + aaplPrice +
                ", googPrice=" + googPrice +
                ", id='" + id + '\'' +
                '}';
    }
}
