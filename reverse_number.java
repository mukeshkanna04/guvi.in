import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        
        // Loop to reverse the number
        while (number != 0) {
            // Get the last digit
            int digit = number % 10;
            
            // Add the digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            
            // Remove the last digit from the original number
            number = number / 10;
        }
        
        // Print the reversed number
        System.out.println("Reversed number: " + reversedNumber);
        
        // Close the scanner
        scanner.close();
    }
}
