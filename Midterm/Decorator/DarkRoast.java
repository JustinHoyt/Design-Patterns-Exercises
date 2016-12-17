package Decorator;

public class DarkRoast extends Beverage {
    
    public DarkRoast(){
        description = "DarkRoast ";
    }
    
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 1.99;
    }

}
