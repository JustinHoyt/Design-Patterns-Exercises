package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;
    
    @Override
    public String toString() {
        return "WeatherData [temperature=" + temperature + ", humidity=" + humidity + ", pressure=" + pressure + "]";
    }

    public WeatherData() {
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
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(double temperature, double humidity, double d){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = d;
        measurementsChanged();
    }
    
}
