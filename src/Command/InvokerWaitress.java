package Command;

class InvokerWaitress {

    private CommandOrder commandOrder;

    public void SetCommand_TakeOrder(CommandOrder command_order) {
        this.commandOrder = command_order;
    }

    public void Orderup() {
        commandOrder.executeOrderup();
    }
}