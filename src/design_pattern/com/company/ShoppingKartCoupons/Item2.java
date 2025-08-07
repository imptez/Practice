package design_pattern.com.company.ShoppingKartCoupons;

public class Item2 extends Product{

    public Item2(String itemName, Double originalPrice, ProductType productType) {
        super(itemName, originalPrice, productType);
    }

    @Override
    public Double getPrice() {
        return this.originalPrice;
    }
}
