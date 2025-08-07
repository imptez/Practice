package design_pattern.com.company.StrategyDesignPattern;

public class Test {
    public static void main(String[] args) {
        System.out.println("********************Sports Vehicle*****************");
        Vehicle sportsVehicle= new SportsVehicle();
        System.out.println(sportsVehicle.getDrive());
        System.out.println("********************Goods Vehicle*****************");
        Vehicle goodsVehicle= new GoodsVehicle();
        System.out.println(goodsVehicle.getDrive());
        System.out.println("********************OffRoad Vehicle*****************");
        Vehicle offRoad= new OffRoadVehicle();
        System.out.println(offRoad.getDrive());

    }
}
