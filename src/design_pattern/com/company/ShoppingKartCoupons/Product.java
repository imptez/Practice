package design_pattern.com.company.ShoppingKartCoupons;

public abstract class Product {
    String itemName;
    Double originalPrice;
    ProductType productType;

    public Product() {
    }

    public Product(String itemName, Double originalPrice, ProductType productType) {
        this.itemName = itemName;
        this.originalPrice = originalPrice;
        this.productType = productType;
    }


    public abstract Double getPrice() ;

    public ProductType getProductType() {
        return productType;
    }
}
