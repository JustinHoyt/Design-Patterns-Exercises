package AbstractFactory;

public class ConcreteWindow extends AbstractFactoryWidget{

    @Override
    public AbstractPushButton createPushButton() {
        return new PushButtonWindow();
    }

    @Override
    public AbstractTextField createTextField() {
        return new TextFieldWindow();
    }
    
}