package Facade;

public class Driver {

    public static void main(String[] args) {
        Customer customer = new Customer(2500, false, false, "John Wayne");
        Customer customer1 = new Customer(2500, true, true, "John Doe");
        Bank bank = new Bank();
        Loan loan = new Loan();
        Credit credit = new Credit();
        
        MortgageApplicationFacade Mortgage = new MortgageApplicationFacade(customer1, bank, loan, credit); 
        boolean eligable = Mortgage.isEligible(customer, 2400); 
        if (eligable)
            System.out.println("Mortgage is approved");
        else
            System.out.println("Mortgage is not approved");
        System.out.println("");
    }

}
