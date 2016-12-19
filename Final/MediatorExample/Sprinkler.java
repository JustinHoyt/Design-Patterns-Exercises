package MediatorExample;

public class Sprinkler extends Appliance {
    public Sprinkler(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("Sprinkler received: " + message);
    }
}
