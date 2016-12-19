package ObserverExample;

public interface Stock {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
    public void setPrice(int price);
}
