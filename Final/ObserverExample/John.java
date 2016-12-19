package ObserverExample;

public class John implements Observer {
    private String investorName;
    private int previousIBMStockPrice;
    private int currentIBMStockPrice;
    private int previousMicrosoftStockPrice;
    private int currentMicrosoftStockPrice;
    private IBM ibm;
    private Microsoft microsoft;
    
    
    
    public John() {
        this.investorName = "John";
        this.ibm = new IBM();
        this.microsoft = new Microsoft();
    }

    public void display() {
        System.out.println(investorName + " says: ");
        System.out.println("Previous IBM stock price: " + previousIBMStockPrice);
        System.out.println("Current IBM stock price: " + currentIBMStockPrice);
        System.out.println("Previous Microsoft stock price: " + previousMicrosoftStockPrice);
        System.out.println("Current IBM stock price: " + currentMicrosoftStockPrice);
        System.out.println();
    }

    @Override
    public void update(int price) {
        previousIBMStockPrice = currentIBMStockPrice;
        currentIBMStockPrice = price;
        previousMicrosoftStockPrice = currentMicrosoftStockPrice;
        currentMicrosoftStockPrice = price;
        display();
    }
}
