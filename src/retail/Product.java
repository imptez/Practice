package retail;

import java.util.UUID;

public final class Product {
    private final String productId;
    private final String productName;
    private final String category;
    private final boolean inStock;
    private final int quantity;

    public Product(String productName, String category, boolean inStock, int quantity) {
        this.productId = UUID.randomUUID().toString();
        this.productName = productName;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public boolean isInStock() {
        return inStock;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", inStock=" + inStock +
                ", quantity=" + quantity +
                '}';
    }
}
