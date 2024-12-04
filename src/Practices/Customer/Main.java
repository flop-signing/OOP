package Practices.Customer;

public class Main {

        public static void main(String[] args) {
            // Creating a regular Customer
            Customer customer = new Customer("John Doe", "john@example.com");
            customer.addPurchase(100);
            customer.addPurchase(200);
            customer.displayDetails();

            System.out.println();

            // Creating a LoyalCustomer
            LoyalCustomer loyalCustomer = new LoyalCustomer("Alice Smith", "alice@example.com", 10.0);
            loyalCustomer.addDiscountedPurchase(300);
            loyalCustomer.addDiscountedPurchase(150);
            loyalCustomer.displayDetails();
        }
}
