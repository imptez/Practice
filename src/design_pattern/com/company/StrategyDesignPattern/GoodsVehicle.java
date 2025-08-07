package design_pattern.com.company.StrategyDesignPattern;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new CityDrive());
    }
}
