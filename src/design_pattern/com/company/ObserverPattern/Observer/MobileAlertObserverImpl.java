package design_pattern.com.company.ObserverPattern.Observer;

import design_pattern.com.company.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String email, StockObservable observable) {
        this.username = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("msg send to " + this.username);
    }
}
