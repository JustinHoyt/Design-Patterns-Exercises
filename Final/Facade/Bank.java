package Facade;

public class Bank {
    public boolean hasSufficientSavings(Customer customer, int loanAmount) {
        if(customer.getSavingAmount() > loanAmount) {
            return true;
        }
        else return false;
    }
}
