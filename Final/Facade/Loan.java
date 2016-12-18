package Facade;

public class Loan {
    public boolean hasBadLoans(Customer customer) {
        if(customer.isHasBadLoan() && customer.getSavingAmount() < 1000) {
            return true;
        }
        else return false;
    }
}
