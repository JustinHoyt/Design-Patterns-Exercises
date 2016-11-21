package ChainOfResponsibility;

abstract class Handler {
    protected Handler successor;

    public void SetSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(int requestID);
}