package Template;

public class Driver {

    public static void main(String[] args) {
        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();
        
        System.out.println("Making Tea...");
        tea.prepareReceipt();
        
        System.out.println();
        
        System.out.println("Making Coffee...");
        coffee.prepareReceipt();
    }

}
