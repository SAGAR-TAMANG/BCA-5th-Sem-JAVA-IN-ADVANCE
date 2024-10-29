import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        // Validate the terminating character
        char lastChar = sentence.charAt(sentence.length() - 1);
        if (lastChar != '.' && lastChar != '?' && lastChar != '!') {
            System.out.println("INCORRECT TERMINATING CHARACTER. INVALID INPUT");
            scanner.close();
            return;
        }

        // Remove the terminating character and split the sentence into words
        sentence = sentence.substring(0, sentence.length() - 1);
        String[] words = sentence.split(" ");

        // Define vowels for checking
        String VOWELS = "AEIOU";

        System.out.println("WORD\t\tCOUNT");

        // Process each word
        for (String word : words) {
            int vowelCount = 0;
            int consonantCount = 0;
            StringBuilder vowelGraph = new StringBuilder();
            StringBuilder consonantGraph = new StringBuilder();

            // Count vowels and consonants
            for (char ch : word.toCharArray()) {
                if (VOWELS.indexOf(ch) >= 0) {
                    vowelCount++;
                    vowelGraph.append("V");
                } else {
                    consonantCount++;
                    consonantGraph.append("C");
                }
            }

            // Output the word and corresponding bar graph
            System.out.println(word + "\t\t" + vowelGraph.toString());
            if (consonantGraph.length() > 0) {
                System.out.println("\t\t" + consonantGraph.toString());
            }
        }

        scanner.close();
    }
}
