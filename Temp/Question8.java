import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string in uppercase: ");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        // Process each word
        for (String word : words) {
            // Convert the first character to uppercase and the rest to lowercase
            String titleCaseWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            result.append(titleCaseWord).append(" ");
        }

        // Trim the trailing space and display the result
        System.out.println("Output: " + result.toString().trim());
    }
}
