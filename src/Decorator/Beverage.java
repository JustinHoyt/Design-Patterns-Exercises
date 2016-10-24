package Decorator;

public abstract class Beverage {
    public String description = "Beverage";

    public String getDescription() {
        return description;
    }
    
    public abstract double getCost();
    
}
