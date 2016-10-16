package AbstractFactory;

public class ConcreteMac extends AbstractFactoryWidget{

    @Override
    public AbstractPushButton createPushButton() {
        return new PushButtonMac();
    }

    @Override
    public AbstractTextField createTextField() {
        return new TextFieldMac();
    }
    
}