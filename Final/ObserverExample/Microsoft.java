package ObserverExample;

import java.util.ArrayList;
import java.util.List;

public class Microsoft implements Stock {
    private String name;
    private int price;
    private List<Observer> observers;
    
    public Microsoft() {
        this.name = "Microsoft";
        this.price = 1;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       int i = observers.indexOf(o);
       if (i >= 0)
           observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            Observer observer = o;
            observer.update(price);
        }
    }
    
    @Override
    public void setPrice(int price) {
        this.price = price;
        stockPriceChange();
    }
    
    public void stockPriceChange() {
        notifyObserver();
    }
}
