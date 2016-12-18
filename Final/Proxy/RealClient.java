package Proxy;

public class RealClient implements IClient{
    private String accountNum;
    
    public RealClient() {
        System.out.println("Real Client Initialized");
        accountNum = "911";
    }
    
    @Override
    public String getAccountNum() {
        System.out.println(accountNum);
        return accountNum;
    }
}
