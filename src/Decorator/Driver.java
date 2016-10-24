package Decorator;

public class Driver {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
        
        beverage = new Mocha(beverage);
        beverage = new WhippedCream(beverage);
        
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
    }

}
