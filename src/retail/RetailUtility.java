package retail;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class RetailUtility {
    public static void main(String[] args) {
        List<Order> orders = createOrder();
        orders.forEach(System.out::println);
        Map<String,Integer> salesreportMap= generateSalesReprot(orders);
        salesreportMap.forEach((s, integer) -> System.out.println("The Category is "+s+" the quanity sold is "+integer));
        Map<String,Integer> stockMap= buildStock();
        List<String> problematicOrders = findOrdersWithStockIssues(orders,stockMap);
        problematicOrders.forEach(System.out::println);
    }

    private static List<String> findOrdersWithStockIssues(List<Order> orders, Map<String, Integer> stockMap) {
        return orders.stream()
                .filter(order -> order.getProducts().stream()
                        .filter(Product::isInStock)
                .anyMatch(product -> product.getQuantity()>stockMap.getOrDefault(product.getProductName(),0)))
                .map(Order::getOrderId)
                .toList();
    }

    private static Map<String, Integer> buildStock() {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("iPhone", 1); // insufficient
        stock.put("Jackets", 10);
        stock.put("Jeans", 5);
        stock.put("Headphone", 4);
        stock.put("Laptop", 5);
        return stock;
    }

    private static Map<String, Integer> generateSalesReprot(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getOrderTime().isAfter(LocalDateTime.now().minusHours(24)) && order.getTotalValue() > 500)
                .flatMap(order -> order.getProducts().stream())
                .filter(Product::isInStock)
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingInt(Product::getQuantity)))
                .entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));

    }

    private static List<Order> createOrder() {
        return Arrays.asList(new Order(Arrays.asList(new Product("iPhone","Electronics",true,2),
                                                                 new Product("Headphone","Electronics",true,1),
                                                                 new Product("Jeans","Fashion",true,3)),
                        600.0, LocalDateTime.now().minusHours(2)),
                                        new Order(Arrays.asList(new Product("Laptop","Electronics",true,2),
                                                                new Product("Tshirt","Fashion",false,1),
                                                                new Product("Jackets","Fashion",true,3)),
                        900.0, LocalDateTime.now().minusHours(4)),
                                        new Order(Arrays.asList(new Product("strol","Fashion",false,2),
                                                                new Product("Tshirt","Fashion",true,1),
                                                                new Product("Jackets","Fashion",true,3)),
                        400.0, LocalDateTime.now().minusHours(4)),
                                        new Order(Arrays.asList(new Product("strol","Fashion",false,2),
                                                                new Product("Tshirt","Fashion",true,1),
                                                                new Product("Jackets","Fashion",true,3)),
                        300.0, LocalDateTime.now().minusHours(28)),
                                        new Order(Arrays.asList(new Product("keyboard","Electronics",false,2),
                                                                new Product("mouse","Electronics",true,1),
                                                                new Product("pendrive","Electronics",true,5)),
                        200.0, LocalDateTime.now().minusHours(10))
                );
    }
}
