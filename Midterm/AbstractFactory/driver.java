package AbstractFactory;

public class driver {

    public static void main(String[] args) {
        AbstractFactoryWidget factoryWindow = new ConcreteWindow();
        Client client1 = new Client(factoryWindow);
        client1.run();
        
        AbstractFactoryWidget factoryMac = new ConcreteMac();
        Client client2 = new Client(factoryMac);
        client2.run();
    }

}
