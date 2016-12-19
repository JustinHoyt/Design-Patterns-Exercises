package final_observer;

public class GraceDisplay implements Observer, DisplayElement{
    private StockData stockData;
    
    public GraceDisplay(StockData weatherData) {
        this.stockData = weatherData;
    }
    
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "GraceDisplay [weatherData=" + stockData.toString() + "]";
    }

    @Override
    public void update(double ibm, double microsoft) {
        display();
    }
    
}
