package Decorator;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf ";
    }
    
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 0.50;
    }

}
