package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<TS> temps = new ArrayList<>();
        temps.add(new TS1());
        temps.add(new TS2());
        temps.add(new TS3Adapter());
        
        for(TS temp : temps){
            temp.getTemp();
        }
    }

}
