import java.util.Scanner;

public class Question4 {
    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Reverse a number
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Check if a number is an Adam number
    public static boolean isAdam(int num) {
        int square = num * num;
        int reverseSquare = reverse(num) * reverse(num);
        return square == reverse(reverseSquare);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for m: ");
        int m = scanner.nextInt();
        System.out.print("Enter value for n: ");
        int n = scanner.nextInt();

        // Validate range
        if (m >= n) {
            System.out.println("INVALID INPUT");
            scanner.close();
            return;
        }

        // Find and display Prime-Adam numbers
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        int frequency = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isAdam(i)) {
                System.out.print(i + " ");
                frequency++;
            }
        }

        if (frequency == 0) {
            System.out.println("NIL");
        }
        System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: " + frequency);
        
        scanner.close();
    }
}
