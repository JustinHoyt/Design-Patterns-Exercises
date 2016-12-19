package MediatorExample;

public class CoffeePot extends Appliance {
    public CoffeePot(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("CoffeePot received: " + message);
    }
}
