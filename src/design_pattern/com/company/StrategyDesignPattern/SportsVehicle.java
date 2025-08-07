package design_pattern.com.company.StrategyDesignPattern;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDrive());
    }

}
