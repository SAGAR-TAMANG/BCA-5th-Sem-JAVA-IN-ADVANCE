import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Give a String Input:");
        
        String input = scn.nextLine();
        
        char[] charArray = input.toCharArray();
        
        Arrays.sort(charArray);
        
        String sortedString = new String(charArray);
        
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
    }
}
