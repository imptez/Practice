package design_pattern.com.company.ShoppingKartCoupons;

import java.util.ArrayList;
import java.util.List;

public class TypeCouponDecorator extends CouponDecorator{

    Product product;
    int discountPercentage;
    ProductType productType;

    static List<ProductType> eligibleTypes = new ArrayList<>();

    static {
        eligibleTypes.add(ProductType.Electronic);
        eligibleTypes.add(ProductType.Clothes);
    }

    public TypeCouponDecorator(Product product, int discountPercentage, ProductType productType) {
        this.product = product;
        this.discountPercentage = discountPercentage;
        this.productType = productType;
    }

    @Override
    public Double getPrice() {
        double price= product.getPrice();
        if(eligibleTypes.contains(productType)){
            return price - (price*discountPercentage)/100;
        }
        return price;
    }
}
