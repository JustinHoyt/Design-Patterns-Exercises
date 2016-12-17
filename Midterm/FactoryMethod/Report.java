package FactoryMethod;

public class Report extends Document{

    @Override
    public void createPages() {
        pages.add(new SummaryPage());
        pages.add(new ConclusionsPage());
    }
    
    @Override
    public String getDocName() {
        return "Report";
    }
   
}