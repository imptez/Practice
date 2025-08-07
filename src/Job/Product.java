package Job;
/*
*Write code using streams to print the employee who works in Product Team and Is located in
*bangalore
*/
public class Product {
    private final String name;
    private final String location;
    private final String productTeam;

    public Product(String name, String location, String productTeam) {
        this.name = name;
        this.location = location;
        this.productTeam = productTeam;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getProductTeam() {
        return productTeam;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", productTeam='" + productTeam + '\'' +
                '}';
    }
}
