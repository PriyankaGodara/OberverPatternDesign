package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObservable;


public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.observable = observable;
        this.userName = userName;
    }
    @Override
    public void update() {
        sendMsgOnMoblie(userName, "Product is in stock Hurry Up!!");
    }
    private void sendMsgOnMoblie(String userName, String msg){
        System.out.println("msg sent to :" + userName);
    }
}
