package Command;

abstract class CommandOrder {
    protected ReceiverCook receiverCook;

    public CommandOrder() { }

    public abstract void executeOrderup();
}