// Q3. Write a java program to find the minimum of three numbers using the ternary operator.

public class Question5 {
  public static void main(String[] args) {
    int a = 20, b = 10, c = 30, result;

    result = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;

    System.out.println("Minimum is: " + result);
  }
}