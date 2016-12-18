package mediator;

public class Driver {

    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        ConcreteColleague mobile = new ConcreteColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello world");
        mobile.send("Hello from mobile");
    }

}
