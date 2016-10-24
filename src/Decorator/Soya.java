package Decorator;

public class Soya extends CondimentDecorator {

    Beverage beverage;
    
    public Soya(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soya";
    }

    @Override
    public double getCost() {
        return .25 + beverage.getCost();
    }

}
