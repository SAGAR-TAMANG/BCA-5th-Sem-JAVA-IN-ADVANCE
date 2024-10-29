import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept the word to encrypt
        System.out.print("Enter the word to encrypt: ");
        String word = scanner.nextLine().toUpperCase(); // Convert to uppercase for consistency
        
        // Accept the shift key
        System.out.print("Enter the shift key (number of positions): ");
        int shiftKey = scanner.nextInt();
        
        String encryptedWord = ""; // To store the encrypted word
        
        // Loop through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            // Check if the character is an uppercase letter
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Calculate the new character
                char shiftedChar = (char) (((currentChar - 'A' + shiftKey) % 26) + 'A');
                encryptedWord += shiftedChar; // Append to encrypted word
            } else {
                encryptedWord += currentChar; // Retain non-uppercase letters
            }
        }
        
        // Output the encrypted word
        System.out.println("Encrypted word: " + encryptedWord);
    }
}
