package stock;

import java.util.Collections;
import java.util.Set;

public class StockUpdateEventHandler {

    private final NotificationService notificationService;
    SubscriptionRegistry subscriptionRegistry = new SubscriptionRegistry();

    public static void main(String[] args) {

    }

    public StockUpdateEventHandler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void onStockPriceUpdate(String stockSymbol, double newPrice) {


        Set<String> users = subscriptionRegistry.stockToUsers.getOrDefault(stockSymbol, Collections.emptySet());

        for (String user : users) {
            notificationService.sendNotification(user, stockSymbol, newPrice);
        }
    }
}
