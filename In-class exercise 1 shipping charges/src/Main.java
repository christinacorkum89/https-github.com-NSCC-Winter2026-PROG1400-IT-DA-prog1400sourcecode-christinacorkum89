// In-class Exercise 1: Shipping Charges
// Christina Corkum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Shipping Charges Calculator!");
        System.out.println("We'll check if shipping is free or $10 based on your purchase.\n");

        // Ask for purchase amount
        System.out.print("Enter the amount for your total purchase: ");
        double purchaseAmount = scanner.nextDouble();

        double shippingCost;

        // Decide shipping cost
        if (purchaseAmount < 50) {
            shippingCost = 10;
            System.out.println("Since your purchase is under $50, shipping is $10.");
        } else {
            shippingCost = 0;
            System.out.println("Great news — your purchase is $50 or more, so shipping is FREE!");
        }

        // Calculate and display final total
        double finalTotal = purchaseAmount + shippingCost;

        System.out.println("Your final total including shipping is: $" + finalTotal);

        scanner.close();
    }
}