package Strategy;

public class Driver {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
       
        mallardDuck.performFly();
        mallardDuck.performQuack();
        
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }

}
