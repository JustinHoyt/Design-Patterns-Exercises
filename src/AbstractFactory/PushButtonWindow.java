package AbstractFactory;

public class PushButtonWindow extends AbstractPushButton{

    @Override
    public void displayName(AbstractPushButton a) {
        System.out.println("This is Window push button as " + a.getClass().getName());
    }
    
}