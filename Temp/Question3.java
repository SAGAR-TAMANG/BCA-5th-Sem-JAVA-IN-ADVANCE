import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input rows (M) and columns (N)
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        // Validate M and N
        if (M < 3 || M > 9 || N < 3 || N > 9) {
            System.out.println("Error: M and N must be greater than 2 and less than 10.");
            scanner.close();
            return;
        }

        // Initialize the matrix
        int[][] A = new int[M][N];

        // Input elements into the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Enter element at (" + i + ", " + j + "): ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Display the input matrix
        System.out.println("\nInput Matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate the sum of odd elements
        int oddSum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] % 2 != 0) {
                    oddSum += A[i][j];
                }
            }
        }

        // Display the sum of odd elements
        System.out.println("\nSum of odd elements: " + oddSum);

        scanner.close();
    }
}
