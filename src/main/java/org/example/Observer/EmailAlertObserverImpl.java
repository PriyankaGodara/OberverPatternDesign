package org.example.ObserverPattern.Observer;

import org.example.ObserverPattern.Observable.StockObservable;
import org.example.ObserverPattern.Store;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMail(emailId,"Product is in Stock Hurry Up!!");
    }
    private void sendMail(String emailId, String msg){
        System.out.println("mail sent to:" + emailId);
    }
}
