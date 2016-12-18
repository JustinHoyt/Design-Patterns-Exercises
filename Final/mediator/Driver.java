package mediator;

public class Driver {

    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        Colleague desktop = new DesktopColleague(mediator);
        Colleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello from desktop");
        mobile.send("Hello from mobile");
    }

}
