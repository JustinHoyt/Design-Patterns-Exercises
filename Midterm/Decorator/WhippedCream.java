package Decorator;

public class WhippedCream extends CondimentDecorator {

    Beverage beverage;
    
    public WhippedCream(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WhippedCream";
    }

    @Override
    public double getCost() {
        return .17 + beverage.getCost();
    }

}
