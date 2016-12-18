package Strategy;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new FakeQuack();
    }

    @Override
    void display() {
        System.out.println("Rubber Duck");
    }
    
}
