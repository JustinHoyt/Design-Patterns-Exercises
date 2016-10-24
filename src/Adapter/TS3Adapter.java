package Adapter;

public class TS3Adapter extends TS {
    private TS3Adaptee ts3;
    public double temp; 
    public TS3Adapter() {
        ts3 = new TS3Adaptee();
        temp = 70;
    }
    
    @Override
    public void getTemp() {
//        System.out.println("TS3 = " + temp + "C");
        System.out.println("TS3 = " + ts3.getTSTemp(temp) + "F");
    }

}
