package ChainOfResponsibility;

public class Driver {

    public static void main(String[] args) {
        // Setup Chain of Responsibility
        Handler h1 = new Handler1();
        Handler h2 = new Handler2();
        Handler h3 = new Handler3();
        h1.SetSuccessor(h2);
        h2.SetSuccessor(h3);
        // Generate and process request
        int[] requests = { 42, 55, 114, 92, 18, 63, 27, 120, 206 };
        for (int requestID : requests) {
            h1.HandleRequest(requestID);
        }

    }

}
