package Template;

public abstract class CaffeineBeverage {
    public void prepareReceipt() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    public void boilWater() {
        System.out.println("Boiling Water");
    }
    
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    public abstract void brew();
    
    public abstract void addCondiments();
    
    public boolean customerWantsCondiments() {
        return true;
    }
}
