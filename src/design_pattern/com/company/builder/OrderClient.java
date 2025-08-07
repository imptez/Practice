package design_pattern.com.company.builder;

public class OrderClient {
    public static void main(String[] args) {
        Order order = new Order.Builder()
                .setOrderId(12345)
                .setProduct("Iphone")
                .setCustomerNumber("8754585905")
                .setCustomerName("Imptez").build();

        System.out.println(order);
    }


}
