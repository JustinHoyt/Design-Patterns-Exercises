package MediatorExample;

public abstract class Appliance {
    private Mediator mediator;
    
    public Appliance(Mediator m) {
        this.mediator = m;
    }
    
    public void send(String message) {
        mediator.send(message, this);
    }
    
    public Mediator getMediator() {
        return this.mediator;
    }
    
    public abstract void receive(String message);
}
