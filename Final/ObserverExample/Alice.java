package ObserverExample;

public class Alice implements Observer{
    private String investorName;
    private int previousIBMStockPrice;
    private int currentIBMStockPrice;
    private IBM ibm;
    private Microsoft microsoft;
    
    
    
    public Alice() {
        this.investorName = "Alice";
        this.ibm = new IBM();
        this.microsoft = new Microsoft();
    }

    public void display() {
        System.out.println(investorName + " says: ");
        System.out.println("Previous IBM stock price: " + previousIBMStockPrice);
        System.out.println("Current IBM stock price: " + currentIBMStockPrice);
        System.out.println();
    }

    @Override
    public void update(int price) {
        previousIBMStockPrice = currentIBMStockPrice;
        currentIBMStockPrice = price;
        display();
    }
}
