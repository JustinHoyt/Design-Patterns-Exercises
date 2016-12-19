package ObserverExample;

public class Driver {

    public static void main(String[] args) {
        Stock ibm = new IBM();
        Stock microsoft = new Microsoft();
        Observer John = new John();
        Observer Mary = new Mary();
        Observer Alice = new Alice();
        
        ibm.registerObserver(John);
        ibm.registerObserver(Mary);
        ibm.registerObserver(Alice);
        
        microsoft.registerObserver(John);
        microsoft.registerObserver(Mary);
        
        ibm.setPrice(20);
        microsoft.setPrice(2);
    }

}
