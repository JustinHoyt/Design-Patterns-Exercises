package Proxy;

public class Driver {

    public static void main(String[] args) {
        IClient client = new ProtectionProxy("password");
        String accountNumber = client.getAccountNum();
        System.out.println();
        if(!accountNumber.equals("")) {
        System.out.println("Account Number: " + client.getAccountNum());
        }
        System.out.println("Press any key to continue...");
    }

}
