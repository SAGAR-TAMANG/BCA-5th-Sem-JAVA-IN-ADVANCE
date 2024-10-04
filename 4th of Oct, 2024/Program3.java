// Java program to sort a string alphabetically
import java.util.Arrays;

public class Program3 {
  public static String sortString(String input) {
    char[] tempArray = input.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
  }
  
  public static void main(String[] args) {
    String input = "kaziranga";
    String output = sortString(input);
    System.out.println("Input String: " + input);
    System.out.println("Output String: " + output);
  }
}
