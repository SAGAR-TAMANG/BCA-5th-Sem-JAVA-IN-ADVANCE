import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of boxes to pack
        System.out.print("Enter the number of boxes to be packed (up to 1000): ");
        int N = scanner.nextInt();

        // Check if input is within the valid range
        if (N > 1000) {
            System.out.println("INVALID INPUT");
            return;
        }

        // Define carton sizes in descending order
        int[] cartonSizes = {48, 24, 12, 6};
        int totalCartons = 0;
        int remainingBoxes = N;

        System.out.println("\nCarton usage breakdown:");

        // Loop over each carton size
        for (int cartonSize : cartonSizes) {
            // Calculate the number of cartons needed for the current size
            int count = remainingBoxes / cartonSize;
            remainingBoxes = remainingBoxes % cartonSize;

            // If cartons of this size are needed, display them
            if (count > 0) {
                System.out.println(cartonSize + " * " + count + " = " + (cartonSize * count));
                totalCartons += count;
            }
        }

        // If any boxes remain (less than 6), use an additional carton of size 6
        if (remainingBoxes > 0 && remainingBoxes < 6) {
            System.out.println("6 * 1 = 6");
            remainingBoxes = 0;
            totalCartons++;
        }

        // Output remaining boxes, total boxes, and total cartons used
        System.out.println("\nRemaining boxes = " + remainingBoxes);
        System.out.println("Total number of boxes = " + N);
        System.out.println("Total number of cartons = " + totalCartons);
    }
}
