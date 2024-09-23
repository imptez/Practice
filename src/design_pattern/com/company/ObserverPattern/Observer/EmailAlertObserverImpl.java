package design_pattern.com.company.ObserverPattern.Observer;

import design_pattern.com.company.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email send to " + this.email);
    }
}
