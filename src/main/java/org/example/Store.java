package org.example.ObserverPattern;

import org.example.ObserverPattern.Observable.IphoneObservableImpl;
import org.example.ObserverPattern.Observable.StockObservable;
import org.example.ObserverPattern.Observer.EmailAlertObserverImpl;
import org.example.ObserverPattern.Observer.MobileAlertObserverImpl;
import org.example.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStickObservable = new IphoneObservableImpl() {
            @Override
            public void add() { }
            @Override
            public void remove() { }
            @Override
            public void setStockCount() {
            }
        };
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("priyanka@gmail.com", iphoneStickObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStickObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc_userName", iphoneStickObservable);

        iphoneStickObservable.add(observer1);
        iphoneStickObservable.add(observer2);
        iphoneStickObservable.add(observer3);

        iphoneStickObservable.setStockCount(50);
    }
}
