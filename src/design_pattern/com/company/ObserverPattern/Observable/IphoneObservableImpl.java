package design_pattern.com.company.ObserverPattern.Observable;

import design_pattern.com.company.ObserverPattern.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        observers.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount == 0){
            notifySubscriber();
        }
        this.stockCount = stockCount;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
