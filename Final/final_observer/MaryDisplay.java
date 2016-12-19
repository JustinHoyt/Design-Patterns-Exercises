package final_observer;

public class MaryDisplay implements Observer, DisplayElement{
    private StockData stockData;
    
    public MaryDisplay(StockData weatherData) {
        this.stockData = weatherData;
    }
    
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "MaryDisplay [weatherData=" + stockData.toString() + "]";
    }

    @Override
    public void update(double ibm, double microsoft) {
        display();
    }
    
}
