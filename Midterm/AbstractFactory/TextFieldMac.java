package AbstractFactory;

public class TextFieldMac extends AbstractTextField{

    @Override
    public void displayName(AbstractTextField a) {
        System.out.println("This is a Mac text field as " + a.getClass().getName());
    }
    
}