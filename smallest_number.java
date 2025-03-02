import java.util.Scanner;

public class smallest_number {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = num1;  // Assume num1 is the smallest initially

        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Output the smallest number
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
