package MediatorExample;

import java.util.ArrayList;
import java.util.List;

public class ApplianceMediator extends Mediator{
    private List<Appliance> appliances;
    
    public ApplianceMediator() {
        appliances = new ArrayList<>();
    }
    
    @Override
    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }
    
    public void send(String message, Appliance originator) {
        for(Appliance a : appliances) {
            if(a != originator)
                a.receive(message);
        }
    }
}
