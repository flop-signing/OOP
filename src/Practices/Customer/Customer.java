package Practices.Customer;

import java.util.ArrayList;
import java.util.List;

// Base class: Customer
class Customer {
    private String name;
    private String email;
    private List<Double> purchaseHistory;

    // Constructor to initialize customer details
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add a purchase to the history
    public void addPurchase(double amount) {
        if (amount > 0) {
            purchaseHistory.add(amount);
            System.out.println("Added purchase: $" + amount);
        } else {
            System.out.println("Invalid purchase amount.");
        }
    }

    // Method to calculate total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Expenditure: $" + calculateTotalExpenditure());
    }
}
