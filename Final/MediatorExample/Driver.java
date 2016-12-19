package MediatorExample;

import mediator.ApplicationMediator;
import mediator.Colleague;
import mediator.DesktopColleague;
import mediator.MobileColleague;

public class Driver {

    public static void main(String[] args) {
        Mediator mediator = new ApplianceMediator();
        Appliance alarm = new Alarm(mediator);
        Appliance coffeePot = new CoffeePot(mediator);
        Appliance sprinkler = new Sprinkler(mediator);
        Appliance calendar = new Calendar(mediator);
        mediator.addAppliance(alarm);
        mediator.addAppliance(coffeePot);
        mediator.addAppliance(sprinkler);
        mediator.addAppliance(calendar);
        alarm.send("Hello from alarm");
        sprinkler.send("Hello from sprinkler");
    }

}
