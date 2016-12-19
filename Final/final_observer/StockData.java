package final_observer;

import java.util.ArrayList;
import java.util.List;

public class StockData implements Subject{
    private List<Observer> observers;
    private double ibm;
    private double microsoft;
    
    @Override
    public String toString() {
        return "StockData [IBM=" + ibm + ", Microsoft=" + microsoft + "]";
    }

    public StockData() {
        observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(ibm, microsoft);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(double ibm, double microsoft){
        this.ibm = ibm;
        this.microsoft = microsoft;
        measurementsChanged();
    }
    
}
