// Ternary Operator

public class Question2 {
  public static void main(String[] args) {
    int a = 20, b = 10, c = 30, result;

    result = ((a > b) ? (a > c) ? a:c: (b > c) ? b:c);

    System.out.println("Maximum of Three Numbers is " + (result));
  }
}
