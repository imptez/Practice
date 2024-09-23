package design_pattern.com.company.ObserverPattern.Observable;

import design_pattern.com.company.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber();

    public void setStockCount(int stockCount);

    public int getStockCount();

}
