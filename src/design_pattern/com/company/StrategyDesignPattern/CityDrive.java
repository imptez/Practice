package design_pattern.com.company.StrategyDesignPattern;

public class CityDrive implements DriveStartegy{
    @Override
    public String getDrive() {
        return "City Drive";
    }
}
