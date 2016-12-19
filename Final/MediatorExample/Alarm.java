package MediatorExample;

public class Alarm extends Appliance{
    public Alarm(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("Alarm received: " + message);
    }
}
