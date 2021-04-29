package com.simran;

public interface IPublisher
{
  public void register(ISubscriber subscriber);
  public void unregister(ISubscriber subscriber);
  public void notifySubscribers();
}
