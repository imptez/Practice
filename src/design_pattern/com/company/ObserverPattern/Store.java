package design_pattern.com.company.ObserverPattern;

import design_pattern.com.company.ObserverPattern.Observable.IphoneObservableImpl;
import design_pattern.com.company.ObserverPattern.Observable.StockObservable;
import design_pattern.com.company.ObserverPattern.Observer.EmailAlertObserverImpl;
import design_pattern.com.company.ObserverPattern.Observer.MobileAlertObserverImpl;
import design_pattern.com.company.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("imtiazmohanty@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("imtiazmohanty@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("user1234",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(100);
    }

}
