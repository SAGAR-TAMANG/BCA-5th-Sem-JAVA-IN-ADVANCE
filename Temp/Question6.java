import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Input 10 numbers into the array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Insertion sort in descending order
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are less than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        // Display the sorted array
        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
