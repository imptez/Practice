package design_pattern.com.company.DecoratorPattern;

public class MushroomTopping implements ToppingDecorator{

    BasePizza basePizza;

    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+50;
    }
}
