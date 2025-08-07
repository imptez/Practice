package Job;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderService {

    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        CompletableFuture<Void> orderFlow = CompletableFuture
                .runAsync(() -> initiatePayment(), executor)
                .thenRunAsync(() -> updateInventory(), executor)
                .thenRunAsync(() -> sendEmailToUser(), executor);
        orderFlow.join();
        executor.shutdown();
        System.out.println("Order placed successfully!");
    }
    private static void initiatePayment() {
        simulateDelay("Initiating Payment");
        System.out.println("Payment successful");
    }

    private static void updateInventory() {
        simulateDelay("Updating Inventory");
        System.out.println("Inventory updated");
    }

    private static void sendEmailToUser() {
        simulateDelay("Sending Email");
        System.out.println("Email sent to user");
    }

    private static void simulateDelay(String taskName) {
        try {
            System.out.println(taskName + " ...");
            Thread.sleep(1000); // simulate 1 sec processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
