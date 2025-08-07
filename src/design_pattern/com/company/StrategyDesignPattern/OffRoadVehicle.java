package design_pattern.com.company.StrategyDesignPattern;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new EconomyDrive());
    }
}
