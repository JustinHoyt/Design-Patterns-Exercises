package Command;

class ConcreteCommandOrder extends CommandOrder {
    ReceiverCook receiverCook;
    // Constructor
    public ConcreteCommandOrder(ReceiverCook receiverCook) {
        this.receiverCook = receiverCook;
    }
    
    @Override
    public void executeOrderup() {
        receiverCook.MakeBurger();
        receiverCook.MakeShake(); 
    }

}