package MediatorExample;

public class Calendar extends Appliance {
    public Calendar(Mediator m) {
        super(m);
    }

    @Override
    public void receive(String message) {
        System.out.println("Calendar received: " + message);
    }
}
