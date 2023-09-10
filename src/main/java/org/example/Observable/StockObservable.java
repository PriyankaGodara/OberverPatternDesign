package org.example.ObserverPattern.Observable;

import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add();
    public  void remove();

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    public void notifySubscribers();
    public void setStockCount();

    void setStockCount(int newStockAdded);

    public int getStockCount();
}
