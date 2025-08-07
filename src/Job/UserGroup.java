package Job;

import java.util.ArrayList;
import java.util.List;

public class UserGroup {

    public static void main(String[] args) {
        List<Product> employeeDetails=createEmployee();
        employeeDetails.stream()
                .filter(product -> product.getLocation().equalsIgnoreCase("Banglore") && product.getProductTeam().equalsIgnoreCase("Product Team"))
                .forEach(System.out::println);
    }

    private static List<Product> createEmployee() {
        List<Product> products= new ArrayList<>();

        Product p1= new Product("Imptez","Banglore","Product Team");
        Product p2= new Product("Sasmita","Banglore","Product Team");
        Product p3= new Product("Amrit","Banglore","Accounts Team");
        Product p4= new Product("Bikash","Mumbai","Product Team");
        Product p5= new Product("Amiya","Banglore","Sales Team");
        Product p6= new Product("Liku","California","Product Team");
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        return products;
    }
}
