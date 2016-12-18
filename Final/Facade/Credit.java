package Facade;

public class Credit {
    public boolean hasBadCredit(Customer customer) {
        if(customer.isHasBadCredit() && customer.getSavingAmount() < 1500) {
            return true;
        }
        else return false;
    }
}
