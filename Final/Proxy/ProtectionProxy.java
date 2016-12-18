package Proxy;

import java.util.Scanner;

public class ProtectionProxy implements IClient{
    private String password;
    private RealClient client;
    
    @Override
    public String getAccountNum() {
        System.out.println("Enter Password: ");
        Scanner sc = new Scanner(System.in);
        String tempPwd = sc.toString();
        if (tempPwd.equals(password)) {
            return client.getAccountNum();
        }
        else System.out.println("Incorrect Password");
        return "";
    }
    
    public ProtectionProxy(String password) {
        this.password = password;
        client = new RealClient();
        System.out.println("Protection Proxy Initialized");
    }
}
