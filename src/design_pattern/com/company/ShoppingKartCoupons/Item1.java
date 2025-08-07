package design_pattern.com.company.ShoppingKartCoupons;

public class Item1 extends Product{

    public Item1(String itemName, Double originalPrice, ProductType productType) {
        super(itemName, originalPrice, productType);
    }

    @Override
    public Double getPrice() {
        return this.originalPrice;
    }
}
