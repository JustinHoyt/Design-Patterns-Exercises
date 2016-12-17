package FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Driver{
    public static void main(String args[]){
        List<Document> docs = new ArrayList<>();
        docs.add(new Resume());
        docs.add(new Report());
        
        for(Document doc : docs){
            System.out.println("\n" + doc.getDocName() + "--");
            for(Page page : doc.pages){
                System.out.print(" ");
                page.getPageName();
            }
        }
    }
}