package final_observer;


public class Driver {
    public static void main(String[] args){
        StockData stockData = new StockData();
        JohnDisplay john = new JohnDisplay(stockData);
        MaryDisplay mary = new MaryDisplay(stockData);
        GraceDisplay grace = new GraceDisplay(stockData);
        
        stockData.registerObserver(john);             
        stockData.registerObserver(mary);             
        stockData.registerObserver(grace);             
        stockData.setMeasurements(80, 30.4);
        stockData.setMeasurements(82, 29.2);
        stockData.setMeasurements(78, 29.2);
    }
}
