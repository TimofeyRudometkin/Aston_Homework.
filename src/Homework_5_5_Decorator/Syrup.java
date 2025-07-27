package Homework_5_5_Decorator;

public class Syrup extends DecoratorPattern{
    public Syrup(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " с сиропом";
    }

    @Override
    public double cost() {
        return drink.cost() + 1.50;
    }
}
