package ChainOfResponsibility;

class Handler2 extends Handler {
    @Override
    public void HandleRequest(int requestID) {
        if (requestID >= 50 && requestID < 100) {
            System.out.println("Request handled by " + this.getClass().getName() + " " + requestID);
        } else if (successor != null) {
            successor.HandleRequest(requestID);
        }
    }
}