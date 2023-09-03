public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        // Initialize the first two numbers in the series
        int first = 0;
        int second = 1;
        // Print the first two numbers
        System.out.print(first + " " + second + " ");
        // Generate and print the rest of the Fibonacci series
        for (int i = 2; i < number; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}
