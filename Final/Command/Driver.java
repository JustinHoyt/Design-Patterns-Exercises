package Command;

public class Driver {

    public static void main(String[] args) {
        ReceiverCook receiverCook = new ReceiverCook();
        CommandOrder commandOrder = new ConcreteCommandOrder(receiverCook);
        InvokerWaitress invokerWaitress = new InvokerWaitress();
        // Set and execute command_order
        invokerWaitress.SetCommand_TakeOrder(commandOrder);
        invokerWaitress.Orderup();

    }

}