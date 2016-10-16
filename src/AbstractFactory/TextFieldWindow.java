package AbstractFactory;

public class TextFieldWindow extends AbstractTextField{

    @Override
    public void displayName(AbstractTextField a) {
        System.out.println("This is Window text field as " + a.getClass().getName());
        
    }
    
}