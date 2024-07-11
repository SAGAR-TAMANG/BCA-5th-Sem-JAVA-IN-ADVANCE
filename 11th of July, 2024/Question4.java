// Q2. Write a java program to find the absolute value of a number using the ternary operator.

import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Give a number:");
    int num = scn.nextInt();

    int abs_num = (num < 0) ? -num : num;

    System.out.println("The absolute value is: " + abs_num);
  }
}