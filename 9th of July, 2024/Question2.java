// Write a program to find 1's compliment.
import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    System.out.println("Give a number: ");
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();
    num = ~num;
    System.out.println(num);
  }
}