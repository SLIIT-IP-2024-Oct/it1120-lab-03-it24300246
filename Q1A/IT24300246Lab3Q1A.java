

import java.util.Scanner;

public class IT24300246Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the price per kilogram of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Get the number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityInKg = scanner.nextDouble();

        // Calculate the total amount to pay
        double totalCost = pricePerKg * quantityInKg;

        // Display the total cost
        System.out.println("The amount you have to pay is: " + totalCost);
    }
}