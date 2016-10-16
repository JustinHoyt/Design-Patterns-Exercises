package AbstractFactory;

public class Client{
    private AbstractTextField abstractTextField;
    private AbstractPushButton abstractPushButton;
    
    public Client(AbstractFactoryWidget factory){
        this.abstractPushButton = factory.createPushButton();
        this.abstractTextField = factory.createTextField();
    }
    
    public void run(){
        abstractPushButton.displayName(abstractPushButton);
        abstractTextField.displayName(abstractTextField);
    }
}