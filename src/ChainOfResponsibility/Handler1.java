package ChainOfResponsibility;

class Handler1 extends Handler {
    @Override
    public void HandleRequest(int requestID) {
        if (requestID < 50) {
            System.out.println("Request handled by " + this.getClass().getName() + " " + requestID);
        } else if (successor != null) {
            successor.HandleRequest(requestID);
        }
    }
}