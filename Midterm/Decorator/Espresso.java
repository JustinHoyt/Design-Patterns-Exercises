package Decorator;

public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso ";
    }
    
    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 4.20;
    }

}
