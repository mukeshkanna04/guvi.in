public class pattern {
    public static void main(String[] args) {
        // Value of i, j, and k
        int n = 5;

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for the columns
            for (int j = 0; j < n - i; j++) {
                // Print the decreasing numbers
                System.out.print(n - j);
            }
            // Inner loop for the remaining part of the row
            for (int k = n - i; k < n; k++) {
                // Print the smallest number for the remaining part
                System.out.print(n - i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
