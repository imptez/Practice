package design_pattern.com.company.builder;

public final class Order {
    private final int orderId;
    private final String customerName;
    private final String shippingAddress;
    private final String customerNumber;
    private final String product;
    private final Double amount;

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.customerName = builder.customerName;
        this.shippingAddress = builder.shippingAddress;
        this.customerNumber = builder.customerNumber;
        this.product = builder.product;
        this.amount = builder.amount;
    }

    public static class Builder {
        private int orderId;
        private String customerName;
        private String shippingAddress;
        private String customerNumber;
        private String product;
        private Double amount;

        public Builder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder setShippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }

        public Builder setProduct(String product) {
            this.product = product;
            return this;
        }

        public Builder setAmount(Double amount) {
            this.amount = amount;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getProduct() {
        return product;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", product='" + product + '\'' +
                ", amount=" + amount +
                '}';
    }
}
