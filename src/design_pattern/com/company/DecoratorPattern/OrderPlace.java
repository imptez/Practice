package design_pattern.com.company.DecoratorPattern;

public class OrderPlace {
    public static void main(String[] args) {
        BasePizza farmhousePizza = new MushroomTopping(new ExtraCheese(new FarmHouse()));
        System.out.println("Cost of Farmhouse Pizza "+farmhousePizza.cost());

        BasePizza vegDelight = new ExtraCheese(new MushroomTopping(new ExtraCheese(new VegDelight())));
        System.out.println("Cost of VegDelight Pizza with double extra cheese and mushroom "+vegDelight.cost());
    }
}
