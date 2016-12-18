package AbstractFactory;

public class PushButtonMac extends AbstractPushButton{

    @Override
    public void displayName(AbstractPushButton a) {
        System.out.println("This is Mac push button as " + a.getClass().getName());
    }
    
}