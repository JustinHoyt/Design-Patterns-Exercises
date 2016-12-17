package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Document {
    List<Page> pages = new ArrayList<>();
    
    public Document(){
        this.createPages();
    }
    
    public abstract String getDocName();
    
    public abstract void createPages();
}