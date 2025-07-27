package Homework_5_5_Decorator;

public abstract class DecoratorPattern implements Drink{
    protected Drink drink;

    public DecoratorPattern(Drink drink) {
        this.drink = drink;
    }
}
