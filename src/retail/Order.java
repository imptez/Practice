package retail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Order {
    private final String orderId;
    private final List<Product> products;
    private final double totalValue;
    private final LocalDateTime orderTime;

    public Order(List<Product> products, double totalValue, LocalDateTime orderTime) {
        this.orderId = UUID.randomUUID().toString();
        this.products = List.copyOf(products);
        this.totalValue = totalValue;
        this.orderTime = orderTime;
    }



    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public double getTotalValue() {
        return totalValue;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", products=" + products +
                ", totalValue=" + totalValue +
                ", orderTime=" + orderTime +
                '}';
    }
}
