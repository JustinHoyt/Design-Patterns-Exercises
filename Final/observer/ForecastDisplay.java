package observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private double currentPressure;
    private double lastPressure;
    private WeatherData weatherData;
    
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "ForecastDisplay [currentPressure=" + currentPressure + ", lastPressure=" + lastPressure
                + ", weatherData=" + weatherData.toString() + "]";
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
    
}
