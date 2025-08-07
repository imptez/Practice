package stock;

public class NotificationService {

    public void sendNotification(String userId, String stockSymbol, double price) {
        // Send via WebSocket or push notification
        System.out.printf("Notify %s -> %s = %.2f%n", userId, stockSymbol, price);
    }
}
