package Builder;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    List<String> parts = new ArrayList<>();
    
    public void add(String part){
        parts.add(part);
    }
    
    public void show(){
        for(String part : parts)
            System.out.print(part);
        System.out.println();
    }
}
