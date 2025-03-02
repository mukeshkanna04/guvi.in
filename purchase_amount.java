import java.util.Scanner;

public class purchase_amount{

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        // Initialize discount and final amount
        double discountAmount = 0.0;
        double finalAmount;

        // Apply discount based on purchase amount
        if (purchaseAmount < 500) {
            // No discount if amount is less than 500
            discountAmount = 0.0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            // 10% discount if amount is between 500 and 1000
            discountAmount = (10.0 / 100) * purchaseAmount;
        } else {
            // 20% discount if amount is greater than 1000
            discountAmount = (20.0 / 100) * purchaseAmount;
        }

        // Calculate the final payable amount
        finalAmount = purchaseAmount - discountAmount;

        // Output the discount and final payable amount
        System.out.println("Discount applied: " + discountAmount);
        System.out.println("Final payable amount: " + finalAmount);

        // Close the scanner
        scanner.close();
    }
}