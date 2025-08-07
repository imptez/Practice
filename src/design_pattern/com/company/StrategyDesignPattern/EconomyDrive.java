package design_pattern.com.company.StrategyDesignPattern;

public class EconomyDrive implements DriveStartegy{
    @Override
    public String getDrive() {
        return "Economy Drive";
    }
}
