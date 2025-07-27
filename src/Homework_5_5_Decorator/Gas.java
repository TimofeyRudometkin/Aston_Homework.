package Homework_5_5_Decorator;

public class Gas extends DecoratorPattern{
    public Gas(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " с газом";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.50;
    }
}
