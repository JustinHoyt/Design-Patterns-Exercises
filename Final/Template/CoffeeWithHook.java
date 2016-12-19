package Template;

public class CoffeeWithHook extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through Filter");
    }
    
    @Override
    public void addCondiments() {
        System.out.println("Adding Milk");
    }
    
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.equals("y"))
            return true;
        else if(answer.equals("n"))
            return false;
        return false;
    }
    
    private String getUserInput() {
        String answer = "y";   // hardcoded to yes
        System.out.println("Woud you like milk? ");
        // read response in
        return answer;
    }
}
