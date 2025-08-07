package design_pattern.com.company.ShoppingKartCoupons;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addToCart(Product product) {
        Product productWithEligibleDiscount = new TypeCouponDecorator(new PercentageCouponDecorator(product, 3), 5, product.productType);
        productList.add(productWithEligibleDiscount);
    }

    public double getTotalPrice() {
        return productList.stream()
                .map(Product::getPrice)
                
                .reduce((double) 0, Double::sum);
    }
}
