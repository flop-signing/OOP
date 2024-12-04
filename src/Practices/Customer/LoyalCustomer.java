package Practices.Customer;

public class LoyalCustomer extends Customer{
    private double discountRate;
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate=discountRate;
    }

    // Method to apply a discount to a purchase
    public void addDiscountedPurchase(double amount) {
        double discountedAmount = amount - (amount * discountRate / 100);
        addPurchase(discountedAmount);
        System.out.println("Original price: $" + amount + ", Discounted price: $" + discountedAmount);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
    }

