package design_pattern.com.company.StrategyDesignPattern;

public class   Vehicle  {

    DriveStartegy obj;

    public String getDrive() {
        return obj.getDrive();
    }

    public Vehicle(DriveStartegy obj) {
        this.obj = obj;
    }


}
