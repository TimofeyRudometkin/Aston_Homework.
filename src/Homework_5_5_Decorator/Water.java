package Homework_5_5_Decorator;

public class Water implements Drink{
    @Override
    public String getDescription() {
        return "Вода";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}
