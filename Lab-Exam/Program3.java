import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
      int first = 0, second = 1;
      
      System.out.println("How many numbers of fibo?");
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      System.out.print("Fibonacci Series: " + first + ", " + second);

      for (int i = 2; i < n; i++) {
        int next = first + second;
        System.out.print(", " + next);
        first = second;
        second = next;
      }
  }
}