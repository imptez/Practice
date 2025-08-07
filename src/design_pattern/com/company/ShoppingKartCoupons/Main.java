package design_pattern.com.company.ShoppingKartCoupons;

public class Main {
    public static void main(String[] args) {
        Product item1= new Item1("Television", 1000.0,ProductType.Electronic);
        Product item2= new Item2("BED", 3000.0,ProductType.Furniture);

        ShoppingCart shoppingCart= new ShoppingCart();
        shoppingCart.addToCart(item1);
        shoppingCart.addToCart(item2);

        System.out.println("The Total price is "+ shoppingCart.getTotalPrice());
    }
}
