package final_observer;

public class JohnDisplay implements Observer, DisplayElement{
    private StockData stockData;
    
    public JohnDisplay(StockData weatherData) {
        this.stockData = weatherData;
    }
    
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "JohnDisplay [weatherData=" + stockData.toString() + "]";
    }

    @Override
    public void update(double ibm, double microsoft) {
        display();
    }
    
}
