package Template;

public class TeaWithHook extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Putting in tea bag");
    }
    
    @Override
    public void addCondiments() {
        System.out.println("Adding sugar");
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
        System.out.println("Woud you like sugar? ");
        // read response in
        return answer;
    }
}
