package stock;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SubscriptionRegistry {

    Map<String, Set<String>> stockToUsers;

    public SubscriptionRegistry() {
        this.stockToUsers= new ConcurrentHashMap<>();
    }

    public void subscribe(String userId, String stockSymbol) {
        this.stockToUsers.computeIfAbsent(stockSymbol,s -> ConcurrentHashMap.newKeySet()).add(userId);
    }
}
