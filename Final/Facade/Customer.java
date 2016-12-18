package Facade;

public class Customer {
    private int savingAmount;
    private boolean hasBadLoan;
    private boolean hasBadCredit;
    private String name;
    
    // Constructor
    public Customer(int savingAmount, boolean hasBadLoan, boolean hasBadCredit, String name) {
        super();
        this.savingAmount = savingAmount;
        this.hasBadLoan = hasBadLoan;
        this.hasBadCredit = hasBadCredit;
        this.name = name;
    }
    
    // Getters and Setters
    public int getSavingAmount() {
        return savingAmount;
    }
    public void setSavingAmount(int savingAmount) {
        this.savingAmount = savingAmount;
    }
    public boolean isHasBadLoan() {
        return hasBadLoan;
    }
    public void setHasBadLoan(boolean hasBadLoan) {
        this.hasBadLoan = hasBadLoan;
    }
    public boolean isHasBadCredit() {
        return hasBadCredit;
    }
    public void setHasBadCredit(boolean hasBadCredit) {
        this.hasBadCredit = hasBadCredit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
